package com.sunbeam;

import java.util.Date;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-31 12:32
 */

// T is generic type
class Box<T> {
	private T obj;
	public void set(T obj) {
		this.obj = obj;
	}
	public T get() {
		return this.obj;
	}
}

/*
public class Demo06Main {
	// unbounded type parameter -- Box<?>
	public static void printAnyBox(Box<?> b) {
		System.out.println("In Box: " + b.get());
	}
	
	public static void main(String[] args) {
		Box<Integer> b1 = new Box<>();
		b1.set(new Integer(123));
		printAnyBox(b1);

		Box<Number> b2 = new Box<>();
		b2.set(new Double(3.14));
		printAnyBox(b2);
		
		Box<Object> b3 = new Box<>();
		b3.set(new Date());
		printAnyBox(b3);
		
		Box<String> b4 = new Box<>();
		b4.set(new String("Sunbeam"));
		printAnyBox(b4);
	}
}
*/

/*
public class Demo06Main {
	// upper bounded type parameter -- Box<? extends ____>
	public static void printNumberBox(Box<? extends Number> b) {
		System.out.println("In Box: " + b.get());
	}
	
	public static void main(String[] args) {
		Box<Integer> b1 = new Box<>();
		b1.set(new Integer(123));
		printNumberBox(b1);

		Box<Number> b2 = new Box<>();
		b2.set(new Double(3.14));
		printNumberBox(b2);
		
		Box<Object> b3 = new Box<>();
		b3.set(new Date());
		//printNumberBox(b3); // compiler error
		
		Box<String> b4 = new Box<>();
		b4.set(new String("Sunbeam"));
		//printNumberBox(b4); // compiler error
	}
}
*/


public class Demo06Main {
	// lower bounded type parameter -- Box<? extends ____>
	public static void printSuperNumberBox(Box<? super Number> b) {
		System.out.println("In Box: " + b.get());
	}
	
	public static void main(String[] args) {
		Box<Integer> b1 = new Box<>();
		b1.set(new Integer(123));
		//printNumberBox(b1); // compiler error

		Box<Number> b2 = new Box<>();
		b2.set(new Double(3.14));
		printSuperNumberBox(b2);
		
		Box<Object> b3 = new Box<>();
		b3.set(new Date());
		printSuperNumberBox(b3); 
		
		Box<String> b4 = new Box<>();
		b4.set(new String("Sunbeam"));
		//printNumberBox(b4); // compiler error
	}
}













