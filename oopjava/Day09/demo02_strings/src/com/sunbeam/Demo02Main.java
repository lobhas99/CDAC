package com.sunbeam;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-30 10:25
 */

public class Demo02Main {
	/*
	public static void main(String[] args) {
		// String is immutable
		String s1 = "sunbeam";
		String s2 = s1.replace("be", "BE");
		System.out.println("s1 = " + s1); //sunbeam 
		System.out.println("s2 = " + s2); //sunBEam
	}
	*/
	
	/*
	public static void main(String[] args) {
		// StringBuilder is mutable
		String s1 = "Infotech";
		System.out.println("s1 : " + s1);
		StringBuilder sb = new StringBuilder(s1);
		System.out.println("before reverse() sb: " + sb);
		sb.reverse();
		System.out.println("after reverse() sb: " + sb);
		String s2 = sb.toString();
		System.out.println("s2 : " + s2);
	}
	*/

	/*
	public static void main(String[] args) {
		// StringBuilder is mutable -- added in Java 5.0
		// StringBuilder is non-synchronized i.e. not thread-safe -- faster execution
		StringBuilder sb = new StringBuilder();
		System.out.println("Capacity: " + sb.capacity()); // 16
		System.out.println("Length: " + sb.length()); // 0
		sb.append("0123456789");
		System.out.println("Capacity: " + sb.capacity()); // 16
		System.out.println("Length: " + sb.length()); // 10
		sb.append("ABCDEF");
		System.out.println("Capacity: " + sb.capacity()); // 16
		System.out.println("Length: " + sb.length()); // 16
		sb.append("XYZ"); // new capacity = (old capacity + 1) * 2
		System.out.println("Capacity: " + sb.capacity()); // 34
		System.out.println("Length: " + sb.length()); // 19
	}
	*/
	
	public static void main(String[] args) {
		// StringBuffer is mutable -- since Java 1.0
		// StringBuffer is synchronized i.e. thread-safe -- slower execution
		StringBuffer sb = new StringBuffer();
		System.out.println("Capacity: " + sb.capacity()); // 16
		System.out.println("Length: " + sb.length()); // 0
		sb.append("0123456789");
		System.out.println("Capacity: " + sb.capacity()); // 16
		System.out.println("Length: " + sb.length()); // 10
		sb.append("ABCDEF");
		System.out.println("Capacity: " + sb.capacity()); // 16
		System.out.println("Length: " + sb.length()); // 16
		sb.append("XYZ"); // new capacity = (old capacity + 1) * 2
		System.out.println("Capacity: " + sb.capacity()); // 34
		System.out.println("Length: " + sb.length()); // 19
	}

}








