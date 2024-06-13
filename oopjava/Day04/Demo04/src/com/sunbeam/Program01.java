package com.sunbeam;

public class Program01 {

	public static void swap(int num1, int num2) // copy is created
	{
		int temp = num1;
		num1 = num2;
		num2 = temp;
	}
	
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		System.out.println("Before Swapping");
		System.out.println("Num1 - "+num1 + ", Num2 - "+num2);
		
		swap(num1, num2); // by value
		
		System.out.println("After Swapping");
		System.out.println("Num1 - "+num1 + ", Num2 - "+num2);

	}

}
