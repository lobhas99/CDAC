#!/bin/bash

# Logical operators : -a, -o, !

echo -n "Enter file path : "
read file

if [ -f $file -a -x $file ]
then
	echo "Regular file has execute permissions"
else
	echo "Not regular file or do not have execute permission"
fi




























