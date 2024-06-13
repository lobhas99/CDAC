package com.sunbeam;

public class Program01 {

	public static void main(String[] args) {
		int arr[]; // reference
		
		int arr1[] = new int[5]; // object of an array
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
		
		System.out.println("Using traditional for");
		for(int i = 0; i<5;i++)
			System.out.println("element = "+arr1[i]);
		
		System.out.println("Using For-each");
		
		for(int element:arr1)
			System.out.println("element = "+element);
	}

}
