#!/bin/bash

# for(( init ; cond ; mod))
# do
#	...
# done

# for var in collection
# do
#	...
# done

num=5
# for((i = 1 ; i <= 10 ; i++))
# do
#	res=`expr $i \* $num`
#	echo $res
# done

# for i in 1 2 3 4 5 6 7 8 9 10
for i in `seq 1 10`
do
	res=`expr $i \* $num`
	echo $res	
done





























