#!/bin/bash

# This can be run from the top-level makefile as "make test"

set -e

ALL_TESTS=(
  Arrays
  Cases
  ExpMod
  FibFact
  FibFact2
  FibFact3
  IOOperations
  KnightsTour
  LangExtensions
  Mandelbrot
  Maze
  MiscFeatures
  Oop
  Oop2
  Pentominoes
  Pointers
  RealNumbers
  RecCopy
  Recurse
  Recurse2
  Run6502
  RunCompiler
  Sets
  Shadow
  ShortCircuit
  StateMachine
  Strings
  TypeExt
  VisitList
)

if [ -n "$TESTS" ]; then
  unset ALL_TESTS
  read -a ALL_TESTS <<< "$TESTS"
fi

# Some RISC tests need more than the default 65536 words of RAM
declare -A RISC_MEMSIZE
RISC_MEMSIZE[RunCompiler]=362144

# Some tests may need to be excluded because RISC doesn't support them
declare -A RISC_EXCLUSIONS
RISC_EXCLUSIONS[LangExtensions]=1 # Buffers, native functions

# Generate stdin for IOOperations
echo "19" > ../build/stdin.txt

fail() {
  echo "Failed test $1. See above output for diff"
  exit 1
}

for i in ${ALL_TESTS[@]}; do
  echo "Running test $i..."
  ../build/compile ${i}.ob
  pushd ../build > /dev/null
  ../build/out.prg < ../build/stdin.txt > ../build/$i.output
  popd > /dev/null
  diff -c goldens/$i.output ../build/$i.output || fail $i
done
for i in ${ALL_TESTS[@]}; do
  if [ -v RISC_EXCLUSIONS[$i] ]; then
    echo "Running RISC test $i... (Skipped)"
    continue
  fi
  echo "Running RISC test $i..."
  if [ -v RISC_MEMSIZE[$i] ]; then
    MEM_SIZE=${RISC_MEMSIZE[$i]} ../build/rcompile ${i}.ob
  else
    ../build/rcompile ${i}.ob
  fi
  pushd ../build > /dev/null
  ../build/out.prg < ../build/stdin.txt > ../build/$i.output
  popd > /dev/null
  diff -c goldens/$i.output ../build/$i.output || fail $i
done
for i in ${ALL_TESTS[@]}; do
  echo "Running C++ test $i..."
  ../build/compile -cpp ${i}.ob
  pushd ../build > /dev/null
  ../build/out.prg < ../build/stdin.txt > ../build/$i.output
  popd > /dev/null
  diff -c goldens/$i.output ../build/$i.output || fail $i
done
for i in ${ALL_TESTS[@]}; do
  echo "Running test $i with bounds checking..."
  ../build/compile -bounds ${i}.ob
  pushd ../build > /dev/null
  ../build/out.prg < ../build/stdin.txt > ../build/$i.output
  popd > /dev/null
  diff -c goldens/$i.output ../build/$i.output || fail $i
done
echo "All tests passed!"
