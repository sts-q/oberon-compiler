BUILDDIR=build
CFLAGS=-g -std=c17 -Wall -Wextra -Wpedantic

COMPILER_SRCS=$(wildcard compiler/*.ob) compiler/runtime.c

$(BUILDDIR)/oberonr: $(BUILDDIR)/oberon $(COMPILER_SRCS)
	cp risc_runner/runner.c $(BUILDDIR)/runner.c
	cd compiler; ../$(BUILDDIR)/oberon RCompiler.ob > ../$(BUILDDIR)/rcompiler.c
	$(CC) $(CFLAGS) -o $(@) $(BUILDDIR)/rcompiler.c
	cd $(BUILDDIR); ./oberonr           Compiler.ob >risc_asm.txt
	cd $(BUILDDIR); ./oberonr -dumpcode Compiler.ob >risc_code.txt
	cd $(BUILDDIR); $(CC)  $(CFLAGS) -DMEM_SIZE=65536 -o oberonr  runner.c


# oberon from Compiler.ob
#	oberon1: Compiler.ob --> compiler.c
#	gcc:     compiler.c  --> oberon
#	oberon:  Compiler.ob --> oberon
$(BUILDDIR)/oberon: $(BUILDDIR)/oberon1 $(COMPILER_SRCS)
	cd compiler; ../$(BUILDDIR)/oberon1 Compiler.ob > ../$(BUILDDIR)/compiler.c
	$(CC) $(CFLAGS) -o $(@) -Icompiler $(BUILDDIR)/compiler.c
	cd $(BUILDDIR); cp compiler.c compiler.first.c
	cd $(BUILDDIR); ./oberon Compiler.ob >compiler.c
#	cd $(BUILDDIR); $(CC) $(CFLAGS) -o oberon compiler.c
	: # "======= check for diff"
	cd $(BUILDDIR); diff compiler.c compiler.first.c
	: # "======= "


# oberon1 from Compiler.ob
#	oberon0: Compiler.ob --> compiler.c 
#	gcc:     compiler.c  --> oberon1
$(BUILDDIR)/oberon1: $(BUILDDIR)/oberon0 $(COMPILER_SRCS)
	cd compiler; ../$(BUILDDIR)/oberon0 Compiler.ob > ../$(BUILDDIR)/compiler.c
	$(CC) $(CFLAGS) -o $(@) -Icompiler $(BUILDDIR)/compiler.c

# oberon0 from risc_code.txt
#	gcc: (runner.c  ++  risc_code.txt) --> oberon0
$(BUILDDIR)/oberon0: risc_runner/runner.c risc_bootstrap/risc_code.txt
	mkdir -p $(BUILDDIR)
	cp compiler/* $(BUILDDIR)
	$(CC) $(CFLAGS) -DMAX_MEM=624288 -Irisc_bootstrap -o $(@) risc_runner/runner.c

clean:
	rm -rf build

# test: $(BUILDDIR)/oberonr
#	cd tests/errors && ./run-fail-tests.sh
#	cd tests && ./run-tests.sh

# compiler-test: $(BUILDDIR)/oberonr
#	cd tests && ./compiler-test.sh
