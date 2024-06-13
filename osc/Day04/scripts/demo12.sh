#!/bin/bash

count=0

for file in `ls`
do
	count=`expr $count + 1`
done

echo "File count = $count"




























