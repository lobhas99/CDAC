#!/bin/bash

# file conditionals
# -e $path		--> true if path exist
# -f $file		--> true if file is regular file
# -d $dir		--> true if dir is directory file

# -r $file		--> true if file has read permission
# -w $file		--> true if file has write permission
# -x $file		--> true if file has execute permission

echo "Enter path : "
read path

if [ -e $path ]
then
	echo "path exist"
	if [ -f $path ]
	then
		echo "Regular file"
	elif [ -d $path ]
	then
		echo "Directory file"
	else
		echo "File is of another type"
	fi
	
else
	echo "path doesn't exist"
fi




























