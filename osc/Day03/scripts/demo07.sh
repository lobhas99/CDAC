#!/bin/bash

# case $choice in
# 1)
#	;;
# 2)
#	;;
# *)
#	;;
# esac

echo "1. Add"
echo "2. Sub"
echo -n "Enter your choice : "
read choice

echo -n "Enter two operands : "
read op1 op2

case $choice in
1)
	res=`expr $op1 + $op2`
	;;
2)
	res=`expr $op1 - $op2`
	;;
*)
	echo "Ivalid operation"
	exit
	;;
esac

echo "result = $res"































