#!/bin/bash

echo -n "Enter two numbers : "
read num1 num2

# command substitution
	# substitute result of command in place of it

# sum=`expr $num1 + $num2`
sum=$(expr $num1 + $num2)

echo "sum = $sum"





























