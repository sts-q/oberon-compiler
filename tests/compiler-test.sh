#!/bin/bash

# This can be run from the top-level makefile as "make compiler-test"

set -e

# Start with the current version of the compiler (which transpiles Oberon to C).
# It should work with the bootstrap compiler written in C, or the compiler
# written in Oberon.
cd ..
cd compiler
../build/compile RCompiler.ob
../build/out.prg RCompiler.ob > ../build/rcompiler_risc_asm_from_c.txt
../build/out.prg -dumpcode RCompiler.ob > ../build/risc_code.txt
cc -DMAX_MEM=624288 -I../build -o ../build/risc-rcompiler ../risc_runner/runner.c
# risc-rcompiler is a RISC binary of the RISC compiler. It is the equivalent
# to out.prg above, taking Oberon source and producing risc assembly. So, the
# output of risc-rcompiler can be compared with the same code coming from C.
../build/risc-rcompiler RCompiler.ob > ../build/rcompiler_risc_asm_from_risc.txt
wc ../build/rcompiler_risc_asm_from_c.txt ../build/rcompiler_risc_asm_from_risc.txt
diff ../build/rcompiler_risc_asm_from_c.txt ../build/rcompiler_risc_asm_from_risc.txt

# Test the compiler by having the compiler compile itself

# When this is complete, build/compile.c is the C code generated compiler, and
# build/rcompile.c is the C code generated RISC compiler (that is, code as
# generated by the C binaries

# Use the RISC code generator to generate code for the C compiler
cd ../compiler
MEM_SIZE=624288 ../build/rcompile Compiler.ob

# When this completes, out.prg is a RISC "binary". It interprets RISC code
# for the Compiler.  Thus, running out.prg on Compiler.ob should generate
# C code for Compiler.ob, but the C code was built by the RISC interpreter

../build/out.prg Compiler.ob > ../build/rgen-compiler.c

# The RISC compiler can also generate code for the RISC code generator

../build/out.prg RCompiler.ob > ../build/rgen-rcompiler.c

# The output of the C-based compiler is identical to the output of the
# compiler when run in the RISC interpreter

wc ../build/rgen-compiler.c ../build/rgen-rcompiler.c ../build/rcompiler.c
#diff ../build/rgen-compiler.c ../build/compiler-float.c
diff ../build/rgen-rcompiler.c ../build/rcompiler.c

echo "Compiler built successfully"
