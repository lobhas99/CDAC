package com.sunbeam;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-27 10:20
 */

/*
public class Demo03Main {
	public static void divide(int num, int den) {
		if(den == 0)
			return;		// ignore the problem, if any.
		double result = (double)num / den;
		System.out.println("Result: " + result);
	}
	public static void main(String[] args) {
		divide(22, 7);
		divide(22, 0);
	}

}
*/

/*
public class Demo03Main {
	public static double divide(int num, int den) {
		if(den == 0)
			System.exit(1); // terminate appln if problem found
		double result = (double)num / den;
		return result;
	}
	public static void main(String[] args) {
		double res1 = divide(22, 7);
		System.out.println("Result1: " + res1);
		double res2 = divide(22, 0);
		System.out.println("Result2: " + res2);
		double res3 = divide(3, 100);
		System.out.println("Result3: " + res3);
	}
}
*/

/*
public class Demo03Main {
	public static double divide(int num, int den) {
		if(den == 0)
			return -1;	// return special value to indicate the problem		
		double result = (double)num / den;
		return result;
	}
	public static void main(String[] args) {
		double res1 = divide(22, 7);
		System.out.println("Result1: " + res1);
		double res2 = divide(22, 0);
		if(res2 == -1)
			System.out.println("Division failed.");
		else
			System.out.println("Result2: " + res2);
	}

}
*/

/*
public class Demo03Main {
	public static double divide(int num, int den) {
		if(den == 0)
			throw new RuntimeException("Denominator cannot be zero.");
		double result = (double)num / den;
		return result;
	}
	public static void main(String[] args) {
		try {
			int num1 = 22, den1 = 7; // TODO input from user -- lab assign
			double res1 = divide(num1, den1);
			System.out.println("Result1: " + res1);
		}
		catch(RuntimeException ex) {
			// take corrective action
			System.out.println("Problem: " + ex.getMessage());
		}

		try {
			int num2 = 22, den2 = 0; // TODO input from user -- lab assign
			double res2 = divide(num2, den2);
			System.out.println("Result2: " + res2);
		}
		catch(RuntimeException ex) {
			// take corrective action
			ex.printStackTrace();
		}
	}
}
*/

/*
public class Demo03Main {
	public static double divide(int num, int den) {
		double result = num / den;
		return result;
	}
	public static void main(String[] args) {
		try {
			int num2 = 22, den2 = 0; // TODO input from user -- lab assign
			double res2 = divide(num2, den2);
			System.out.println("Result2: " + res2);
		}
		catch(ArithmeticException ex) {
			// take corrective action
			ex.printStackTrace();
		}

		try {
			int num1 = 22, den1 = 7; // TODO input from user -- lab assign
			double res1 = divide(num1, den1);
			System.out.println("Result1: " + res1);
		}
		catch(Throwable ex) {
			// take corrective action
			System.out.println("Problem: " + ex.getMessage());
		}

	}
}
*/

/*
public class Demo03Main {
	public static int divide(int[] arr, int numIndex, int denIndex) {
		int result = arr[numIndex] / arr[denIndex];
		return result;
	}
	public static void main(String[] args) {
		int[] arr = {11, 22, 33, 44, 7, 0, 8, 9};
		int numIndex = 1, denIndex = 4; // TODO take input from user
		try {
			int result = divide(arr, numIndex, denIndex);
			System.out.println("Result: " + result);
		}
		// multiple catch blocks
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Problem: " + e.getMessage());
		}
		catch (ArithmeticException e) {
			System.out.println("Problem: " + e.getMessage());
		}
		// generic catch block must be last catch block -- if written
		catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
*/

/*
public class Demo03Main {
	public static int divide(int[] arr, int numIndex, int denIndex) {
		int result = arr[numIndex] / arr[denIndex];
		return result;
	}
	public static void main(String[] args) {
		int[] arr = {11, 22, 33, 44, 7, 0, 8, 9};
		int numIndex = 1, denIndex = 4; // TODO take input from user
		try {
			int result = divide(arr, numIndex, denIndex);
			System.out.println("Result: " + result);
		}
		// multi-catch block -- same code to handle different exceptions
		catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
			System.out.println("Problem: " + e.getMessage());
		}
		// generic catch block must be last catch block -- if written
		catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
*/

/*
public class Demo03Main {
	public static double divide(int num, int den) {
		double result = num / den;
		return result;
	}
	public static void main(String[] args) {
		int num2 = 22, den2 = 0; // TODO input from user -- lab assign
		double res2 = divide(num2, den2);
		System.out.println("Result2: " + res2);
	}
}
*/

/*
public class Demo03Main {
	public static double divide(int num, int den) throws Exception {
		if(den == 0)
			throw new Exception("Denominator cannot be zero.");
		double result = (double)num / den;
		return result;
	}
	public static void main(String[] args) {
		try {
			int num1 = 22, den1 = 0; // TODO input from user -- lab assign
			double res1 = divide(num1, den1);
			System.out.println("Result1: " + res1);
		}
		catch(Exception ex) {
			// take corrective action
			System.out.println("Problem: " + ex.getMessage());
		}
	}
}
*/

public class Demo03Main {
	public static double divide(int num, int den) throws Exception {
		if(den == 0)
			throw new Exception("Denominator cannot be zero.");
		double result = (double)num / den;
		return result;
	}
	// bad practice -- to throw exception from main()
	public static void main(String[] args) throws Exception {
		int num1 = 22, den1 = 0; // TODO input from user -- lab assign
		double res1 = divide(num1, den1);
		System.out.println("Result1: " + res1);
	}
}












