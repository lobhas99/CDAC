#!/bin/bash

echo -n "Enter circle radius : "
read r

area=`echo "3.142 * $r * $r" | bc`

echo "area of circle : $area"




























