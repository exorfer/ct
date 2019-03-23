#!/usr/bin/env bash
./BUILD.SH

echo
echo No param test
./run.sh
RES=$?
if [ $? -eq 0 ]; then
    echo Test passed
else
    echo Test failed. Expected 0 Actual ${RES}
fi


echo
echo 1 args
./run.sh foo
RES=$?
if [ $? -eq 1 ]; then
    echo test passed
else
    echo Test failed. Expected 1 Actual ${RES}
fi

echo
echo 2 args
./run.sh foo bar
RES=$?
if [ $? -eq 2 ]; then
    echo test passed
else
    echo Test failed. Expected 2 Actual ${RES}
fi

echo
echo Many args
./run.sh foo bar baz "1 2 3"
RES=$?
if [ $? -eq 100 ]; then
    echo test passed
else
    echo Test failed. Expected 100 Actual ${RES}
fi