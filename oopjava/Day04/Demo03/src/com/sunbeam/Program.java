package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		int arr1[] = new int[5];
		System.out.println(arr1[3]);
		//System.out.println(arr1[5]); //ArrayIndexOutOfBoundsException
		//System.out.println(arr1[-2]); //ArrayIndexOutOfBoundsException
		
		//int arr2[] = new int[-2]; // NegativeArraySizeException]
		System.out.println(args[2]); // ArrayIndexOutOfBoundsException
	}

}
