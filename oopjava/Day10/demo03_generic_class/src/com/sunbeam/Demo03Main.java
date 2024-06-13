package com.sunbeam;

import java.util.ArrayList;
import java.util.Date;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-31 11:01
 */

/*
// generic programming using Object class -- till Java 1.4
// Not type-safe
class ObjectBox {
	private Object obj;
	public void set(Object obj) {
		this.obj = obj;
	}
	public Object get() {
		return this.obj;
	}
}

public class Demo03Main {
	public static void main(String[] args) {
		ObjectBox b1 = new ObjectBox();
		b1.set(new String("Nilesh"));
		String v1 = (String) b1.get();
		System.out.println("v1 = " + v1);
		
		ObjectBox b2 = new ObjectBox();
		b2.set(new Integer(1234));
		Integer v2 = (Integer) b2.get();
		System.out.println("v2 = " + v2);
		
		ObjectBox b3 = new ObjectBox();
		b3.set(new Date());
		Date v3 = (Date) b3.get();
		System.out.println("v3 = " + v3);
		
//		ObjectBox b4 = new ObjectBox();
//		b4.set("3.14");
//		Double v4 = (Double) b4.get(); 	// ClassCastException
//		System.out.println("v4 = " + v4);
		
		// Java collections -- Till Java 1.4
		ArrayList list = new ArrayList();
		list.add(11);
		list.add(22);
		list.add(33);
		list.add("44");
		for (Object ele : list) {
			Integer val = (Integer) ele; // ClassCastException
			System.out.println(val);
		}
	}
}
*/

//generic programming using Generics -- since Java 5.0
//type-safe
class GenericBox<TYPE> {
	private TYPE obj;
	public void set(TYPE obj) {
		this.obj = obj;
	}
	public TYPE get() {
		return this.obj;
	}
}

public class Demo03Main {
	public static void main(String[] args) {
		GenericBox<String> b1 = new GenericBox<String>();
		b1.set(new String("Nilesh"));
		String v1 = b1.get();
		System.out.println("v1: " + v1);
		
		GenericBox<Integer> b2 = new GenericBox<Integer>();
		b2.set(new Integer(123));
		Integer v2 = b2.get();
		System.out.println("v2: " + v2);
		
		GenericBox<Date> b3 = new GenericBox<Date>();
		b3.set(new Date());
		Date v3 = b3.get();
		System.out.println("v3: " + v3);
		
		GenericBox<String> b4 = new GenericBox<String>();
		b4.set("3.14");
		//Double v4 = b4.get(); // compiler error -- types are checked at compile time
		String v4 = b4.get();
		System.out.println("v4: " + v4);
		
		GenericBox<Double> b5 = new GenericBox<>(); // okay -- type inference
		
		//GenericBox<Object> b6 = new GenericBox<String>(); // compiler error
				// cannot convert from GenericBox<String> to GenericBox<Object>
		
		GenericBox b7 = new GenericBox(); // okay -- "raw-types" warning
	
		GenericBox<Object> b8 = new GenericBox<>();
		
		// Java collections -- Since Java 5.0
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(22);
		list.add(33);
		//list.add("44"); // compiler error
		list.add(44);
		for (Integer val : list) {
			System.out.println(val);
		}
	}
}








