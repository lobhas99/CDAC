package com.sunbeam;

import java.util.ArrayList;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-31 12:55
 */

public class Demo07Main {
	// generic method
	public static <T> void printArray(T[] arr) {
		for(T ele : arr)
			System.out.println(ele);
	}
	
	// generic method to sum all numbers
	public static <T extends Number> double sumArray(T[] arr) {
		double total = 0.0;
		for(T ele : arr)
			total = total + ele.doubleValue();
		return total;
	}
	
	
	public static void main(String[] args) {
		String[] arr1 = new String[] { "A", "B", "C", "D" };
		Demo07Main.printArray(arr1); //generic type is inferred = String
	
		Double[] arr2 = new Double[] { 1.1, 2.2, 3.3, 4.4 };
		Demo07Main.printArray(arr2); //generic type is inferred = Double
		
		Integer[] arr3 = new Integer[] { 11, 22, 33, 44 };
		Demo07Main.<Object>printArray(arr3); //generic type is given = Object
		
		//System.out.println("String[] sum : " + sumArray(arr1)); // compiler error
		System.out.println("Double[] sum : " + sumArray(arr2));
		System.out.println("Integer[] sum : " + sumArray(arr3));
		
//		int[] arr = { 10, 20, 30, 40 };
//		printArray(arr); // In Java, generics cannot be used with primitive types
		
//		ArrayList<int> al = new ArrayList<>(); // In Java, generics cannot be used with primitive types
 	}
}











