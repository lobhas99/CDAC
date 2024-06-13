#!/bin/bash

arr=("vim", "ncal", "gcc", "jdk", "mysql")

echo "Upadating package list..."
sudo apt-get update
if [ $? -ne 0 ]
then
	echo "error while updating package list...."
	exit
fi

for package in ${arr[*]}
do
	sudo apt-get install $package
	if [ $? -ne 0 ]
	then
		echo "$package is not installed"
	fi
done















