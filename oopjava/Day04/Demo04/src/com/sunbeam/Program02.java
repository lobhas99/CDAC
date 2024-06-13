package com.sunbeam;

public class Program02 {

	public static void swap(int []arr) // copy of reference
	{
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
	}
	
	public static void main(String[] args) {
		int arr[]  = {10,20};
		
		System.out.println("Before Swapping");
		System.out.println("arr[0] - "+arr[0] + ", arr[1] - "+arr[1]);
		
		swap(arr); // by reference
		
		System.out.println("After Swapping");
		System.out.println("arr[0] - "+arr[0] + ", arr[1] - "+arr[1]);

	}

}
