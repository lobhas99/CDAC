package com.sunbeam;

import java.util.Scanner;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-27 09:38
 */

class MyResource implements AutoCloseable {
	// resource
	public MyResource() {
		System.out.println("Resource created.");
	}
	@Override
	public void close() {
		System.out.println("Resource closed.");
	}
}

public class Demo02Main {
	public static void main(String[] args) {
		MyResource mr1 = new MyResource();
		// use mr1
		mr1.close();
		
		try(MyResource mr2 = new MyResource()) {
			// use mr2
		} // mr2.close();
		
		try(Scanner sc = new Scanner(System.in)) {
			// use scanner
		} // sc.close();
	}
}








