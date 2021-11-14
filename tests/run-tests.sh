#!/bin/bash

set -e

CPP_TESTS=(
  OopTest
  RecCopy
  TestBed
  TypeExt
)

TESTS=(
  ArrayTest
  CaseTest
  FibFact
  IOTest
  KnightsTour
  LangExtensionsTests
  Maze
  Pentominoes
  Recurse2
  Recurse
  SetTest
  Shadow
  ShortCircuit
  StrTest
)

# Generate stdin for IOTest
echo "19" > ../build/stdin.txt

fail() {
  echo "Failed test $1. See above output for diff"
  exit 1
}

for i in ${CPP_TESTS[@]}; do
  echo "Running test $i..."
  ../build/compile -cpp ${i}.ob
  ../build/out.prg < ../build/stdin.txt > ../build/$i.output
  diff -c goldens/$i.output ../build/$i.output || fail $i
done
for i in ${TESTS[@]}; do
  echo "Running test $i..."
  ../build/compile ${i}.ob
  ../build/out.prg < ../build/stdin.txt > ../build/$i.output
  diff -c goldens/$i.output ../build/$i.output || fail $i
done
echo "All tests passed!"
