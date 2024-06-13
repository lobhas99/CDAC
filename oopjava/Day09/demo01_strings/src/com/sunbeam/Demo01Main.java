package com.sunbeam;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-30 08:55
 */

public class Demo01Main {
	/*
	public static void main(String[] args) {
		String str = "Sunbeam";
		System.out.println(str);
		for(int i=0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.print(ch);
		}
		System.out.println();
	}
	*/
	
	/*
	public static void main(String[] args) {
		String str1 = "Ramdeo";
		String str2 = "Ramraj";
		int diff = str1.compareTo(str2);
		System.out.println("Diff: " + diff); // 'd' - 'r'
		
		String str3 = "Sunbeam";
		String str4 = "Sunbeam";
		diff = str3.compareTo(str4);
		System.out.println("Diff: " + diff); // 0 - 0
		
		String str5 = "Sunbeam";
		String str6 = "SunBeam";
		
		diff = str5.compareTo(str6);
		System.out.println("Diff: " + diff); // 'b' - 'B'
	
		diff = str5.compareToIgnoreCase(str6);
		System.out.println("Diff: " + diff); // 0 - 0		
	}
	*/
	
	/*
	public static void main(String[] args) {
		String str5 = "Sunbeam";
		String str6 = "SunBeam";
		
		boolean same = str5.equals(str6);
		System.out.println("Same: " + same); // false
	
		same = str5.equalsIgnoreCase(str6);
		System.out.println("Same: " + same); // true
	}
	*/
	
	/*
	public static void main(String[] args) {
		String str = "ABCD";
		System.out.println("Hash Code: " + str.hashCode());
			// 'A' * 31^3 + 'B' * 31^2 + 'C' * 31^1 + 'D' * 31^0 = 2001986
	}
	*/
	
	/*
	public static void main(String[] args) {
		String str = "Sunbeam";
		System.out.println("startsWith(Sun) = " + str.startsWith("Sun")); // true
		System.out.println("endsWith(AM) = " + str.endsWith("AM")); // false
	}
	*/
	
	/*
	public static void main(String[] args) {
		String str = "Sunbeam";
		int index1 = str.indexOf('b');
		System.out.println("index of b : " + index1); // 3
		int index2 = str.indexOf("am");
		System.out.println("index of am : " + index2); // 5
		int index3 = str.indexOf("ba");
		System.out.println("index of ba : " + index3); // -1
	}
	*/
	
	/*
	public static void main(String[] args) {
		String str = "SunbeamInfotech";
		String str1 = str.substring(7);
		System.out.println("str.substring(7): " + str1); // Infotech
		String str2 = str.substring(7,11);
		System.out.println("str.substring(7,11): " + str2); // Info
	}
	*/
	
	/*
	public static void main(String[] args) {
		String str1 = "Sunbeam";
		String str2 = "Infotech";
		String str3 = str1.concat(str2);
		System.out.println("str1 : " + str1); // Sunbeam
		System.out.println("str2 : " + str2); // Infotech
		System.out.println("str3 : " + str3); // SunbeamInfotech
	}
	*/
	
	/*
	public static void main(String[] args) {
		String str1 = "   Hello  ";
		System.out.println(str1.length() + " |" + str1 + "| ");
		String str2 = str1.trim();
		System.out.println(str2.length() + " |" + str2 + "| ");
	}
	*/
	
	/*
	public static void main(String[] args) {
		String str = "this,is,not,fair";
		String[] parts = str.split(",");
		System.out.println("str = " + str);
		for(String part:parts)
			System.out.println("part = " + part);
	}
	*/
}











