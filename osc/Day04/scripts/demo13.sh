#!/bin/bash

print_msg()
{
	echo "This is my first function"
}

print_number()
{
	# arguments are accessed as $1, $2, $3, ......
	# $1 -> 10
	echo "number = $1"
}

addition()
{
	# $1 -> 10
	# $2 -> 20
	res=`expr $1 + $2`
	echo $res
}


print_msg
print_number 10
sum=`addition 10 20`

echo "sum = $sum"


























