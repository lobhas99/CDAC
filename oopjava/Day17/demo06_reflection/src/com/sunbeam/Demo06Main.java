package com.sunbeam;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-08 12:49
 */

public class Demo06Main {
	public static void main(String[] args) {
		Object result1 = Middleware.callMethod("java.util.Date", "toString", null, null);
		System.out.println("Result1: " + result1);
		
		Class[] argTypes1 = { Integer.class, Integer.class };
		Object[] argValues1 = { 22, 7 };
		Object result2 = Middleware.callMethod("com.sunbeam.Arithmetic", "add", argTypes1, argValues1);
		System.out.println("Result2: " + result2);
	
		Class[] argTypes2 = { Integer.class, Integer.class };
		Object[] argValues2 = { 22, 7 };
		Object result3 = Middleware.callMethod("com.sunbeam.Arithmetic", "multiply", argTypes2, argValues2);
		System.out.println("Result3: " + result3);
	}
}








