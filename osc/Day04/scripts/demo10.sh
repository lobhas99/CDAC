#!/bin/bash

# init
# while [ condition ]
# do
#	...
#	mod
# done

# init
# until [ condition ]
# do
#	...
#	mod
# done

num=5

i=1								# init
# while [ $i -le 10 ]				# cond
until [ $i -eq 11 ]
do
	res=`expr $i \* $num`		# body
	echo $res
	i=`expr $i + 1`				# mod
done






























