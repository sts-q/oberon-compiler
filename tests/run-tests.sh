#!/bin/bash

# This can be run from the top-level makefile as "make test"

set -e

TESTS=(
  ArrayTest
  CaseTest
  FibFact
  FibFact2
  PtrTest
  RecCopy
  RealNumbers
  Mandelbrot
  IOTest
  KnightsTour
  LangExtensionsTests
  Maze
  Pentominoes
  TestCompiler
  Recurse2
  Recurse
  SetTest
  Shadow
  ShortCircuit
  StrTest
  TypeExt
  OopTest
  VisitList
)

RISC_TESTS=(
  ArrayTest
  CaseTest
  FibFact
  FibFact2
  PtrTest
  RecCopy
  RealNumbers
  Mandelbrot
  IOTest
  TestBed
  KnightsTour
  Maze
  Pentominoes
  TestCompiler
  SetTest
  Shadow
  ShortCircuit
  StrTest
  VisitList
)

# Some RISC tests need more than the default 65536 words of RAM
declare -A RISC_MEMSIZE
RISC_MEMSIZE[TestCompiler]=262144

CPP_TESTS=(
  OopTest
  RecCopy
  TestBed
  TypeExt
  VisitList
)

# Generate stdin for IOTest
echo "19" > ../build/stdin.txt

fail() {
  echo "Failed test $1. See above output for diff"
  exit 1
}

for i in ${TESTS[@]}; do
  echo "Running test $i..."
  ../build/compile ${i}.ob
  pushd ../build > /dev/null
  ../build/out.prg < ../build/stdin.txt > ../build/$i.output
  popd > /dev/null
  diff -c goldens/$i.output ../build/$i.output || fail $i
done
for i in ${RISC_TESTS[@]}; do
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
for i in ${CPP_TESTS[@]}; do
  echo "Running C++ test $i..."
  ../build/compile -cpp ${i}.ob
  pushd ../build > /dev/null
  ../build/out.prg < ../build/stdin.txt > ../build/$i.output
  popd > /dev/null
  diff -c goldens/$i.output ../build/$i.output || fail $i
done
echo "All tests passed!"
