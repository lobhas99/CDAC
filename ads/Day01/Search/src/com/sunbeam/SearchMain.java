package com.sunbeam;

import java.util.Scanner;
import java.util.function.LongBinaryOperator;

public class SearchMain {
	
	public static int linearSearch(int arr[], int key) {
		//1. traverse array from 0 to N-1 index
		for(int i = 0 ; i < arr.length ; i++) {
			//2. compare key with ith element
			if(key == arr[i])
				//2.1 if matching return index
				return i;
		}
		//2.2 if not matching return -1
		return -1;
	}
	
	public static int binarySearch(int arr[], int key) {
		//1. decide left and right of original
		int left = 0, right = arr.length-1;
		while(left <= right) {
			//2. find middle element
			int mid = (left + right) / 2;
			//3. compare middle element with key
			if(key == arr[mid])
				return mid;	//3.1 if equal then return index
			else if(key > arr[mid])
				left = mid + 1;	//3.2 if greater then search into right partitioin
			else
				right = mid - 1;	//3.3 if less then search into left partition
		}//4. repeat step 2 and 3 till valid partition or key is not found
		//5. if not fount return -1;
		return -1;
	}
	
	public static int binarySearch(int arr[], int key, int left, int right) {
		//1. stop if invalid partition
		if(left > right)
			return -1;
		//2. find middle element of array
		int mid = (left + right)/2;
		//3. compare middle element with key
		if(key == arr[mid])
			return mid;	// if key is equal
		else if(key > arr[mid])
			return binarySearch(arr, key, mid + 1, right);	// if key is greater search inti right partition
		else
			return binarySearch(arr, key, left, mid - 1);// if key is less then search it into left partition
			
	}

	public static void main(String[] args) {
		//int arr[] = {88, 33, 66, 11, 99, 77, 22, 55, 14};
		int arr[] = {11, 22, 33, 44, 55, 66, 77, 88, 99};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter key to be searched :");
		int key = sc.nextInt();
		
		//int index = linearSearch(arr, key);
		//int index = binarySearch(arr, key);
		int index = binarySearch(arr, key, 0, arr.length-1);
		if(index != -1)
			System.out.println("Key is found at index " + index);
		else
			System.out.println("Key is not found");
		sc.close();
	}

}
