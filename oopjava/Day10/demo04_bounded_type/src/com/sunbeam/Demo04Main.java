package com.sunbeam;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-31 12:04
 */

// bounded type parameter
// N can be any type which is Number or its sub-class
class Box<N extends Number> {
	private N obj;
	public void set(N obj) {
		this.obj = obj;
	}
	public N get() {
		return this.obj;
	}
}

public class Demo04Main {
	public static void main(String[] args) {
		Box<Integer> b1 = new Box<>();
		b1.set(new Integer(3));
		System.out.println("In b1: " + b1.get());
		
		Box<Double> b2 = new Box<>();
		b2.set(new Double(3.14));
		System.out.println("In b2: " + b2.get());
		
		Box<Number> b3 = new Box<>();
		b3.set(new Long(1));
		System.out.println("In b3: " + b3.get());
		
		
		//Box<String> b4 = new Box<>(); // not expected - not allowed
		
		//Box<Object> b5 = new Box<>(); // not expected - not allowed
	}
}





