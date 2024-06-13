package com.sunbeam;

import java.util.Scanner;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-30 12:47
 */

enum Days {
	MON, TUE, WED
}

//class Days extends Enum {
//	// refer notes
//}

public class Demo03Main {
	public static void main(String[] args) {
		Days dy = Days.WED;
		System.out.println("Wed Ordinal: " + dy.ordinal());
		System.out.println("Wed Name: " + dy.name());
		
		Scanner sc = new Scanner(System.in);
		Days[] arr = Days.values();
		for(Days d:arr)
			System.out.println(d.ordinal() + ". " + d.name());
		System.out.print("Enter choice: ");
		int choice = sc.nextInt();
		
		Days ch = arr[choice];
		switch (ch) {
		case MON:
			System.out.println("You entered Monday");
			break;
		case TUE:
			System.out.println("You entered Tuesday");
			break;
		case WED:
			System.out.println("You entered Wed");
			break;
		}
	
		Days day = Days.valueOf("TUE");
		System.out.println("day = " + day);
	}
}

/*
// Java 5.0 added enum - to improve code readability
enum Operations {
	ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION
}

public class Demo03Main {
	public static void main(String[] args) {
		int num1 = 22;
		int num2 = 7;
		Operations choice = Operations.MULTIPLICATION;
		int result;
		
		switch (choice) {
		case ADDITION: 
			result = num1 + num2;
			System.out.println("Addition: " + result);
			break;
		case SUBTRACTION: 
			result = num1 - num2;
			System.out.println("Subtraction: " + result);
			break;
		case MULTIPLICATION: 
			result = num1 * num2;
			System.out.println("Multiplication: " + result);
			break;
		case DIVISION: 
			result = num1 / num2;
			System.out.println("Division: " + result);
			break;
		}
	}
}
*/

/*
public class Demo03Main {
	// Till Java 1.4 -- Code readability was improved using final fields.
	public static final int ADDITION=1;
	public static final int SUBTRACTION=2;
	public static final int MULTIPLICATION=3;
	public static final int DIVISION=4;
	public static void main(String[] args) {
		int num1 = 22;
		int num2 = 7;
		int choice = ADDITION;
		int result;
		
		switch (choice) {
		case ADDITION: 
			result = num1 + num2;
			System.out.println("Addition: " + result);
			break;
		case SUBTRACTION: 
			result = num1 - num2;
			System.out.println("Subtraction: " + result);
			break;
		case MULTIPLICATION: 
			result = num1 * num2;
			System.out.println("Multiplication: " + result);
			break;
		case DIVISION: 
			result = num1 / num2;
			System.out.println("Division: " + result);
			break;
		}
	}
}
*/