package com.sunbeam;

public class Singleton {
	//step-2 -> declare a private static field of same type as that of the class
	private static Singleton singleton;
	
	//step-3 -> write static block to initialize the static reference
	static {
		singleton = new Singleton();
	}
	
	// Step-1 -> Make the ctor as private
	// We cannot create the object of this class outside this class
	private Singleton() {
		System.out.println("Inside Ctor");
	}
	
	
	// step-4 -> provide a getter method that will return the singleton reference.
	public static Singleton getSingleton() {
		return singleton;
	}
	
//	public static Singleton getInstance() {
//		if(ref==null)
//			ref = new Singleton();
//		return ref;
//	}
	
	
	

	
}

