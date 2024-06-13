#!/bin/bash

# Relational operators : -eq, -ne, -lt, -gt, -le, -ge

# if [ condition ]
# then
#	...
# else
#	...
# fi


echo -n "Enter numbers : "
read num1 num2

max=0
if [ $num1 -eq $num2 ]
then
	echo "num1 and num2 are equal"
	max=$num1
elif [ $num1 -gt $num2 ]
then
	echo "num1 is greater"
	max=$num1
else
	echo "num2 is greater"
	max=$num2
fi

echo "maximum number : $max"



























