package com.sunbeam;

public class Program01 {
	
	// Variable Arity/Argument Method
	public static void add(int ...args) {
		int result = 0;
		for(int element: args)
			result= result + element;
		
		System.out.println("Addition = "+ result);
	}
	
//	public static void add(int num1, int num2) {
//		int result = num1 + num2;
//		System.out.println("Addition = "+ result);
//	}
	
	public static void main(String[] args) {
		add(10,20);
		add(10,20,30);
		add(10,20,30,40);
		int arr[] =  {10,20,30,40,50};
		add(arr);
		add(10,20,30,40,50,60);
	}

}
