package com.sunbeam;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-04 08:36
 */


interface Displayable {
	default void show() {
		System.out.println("Displayable.show() called.");
	}
	static void test() {
		System.out.println("Displayable.test() called.");
	}
}

interface Printable {
	default void show() {
		System.out.println("Printable.show() called.");
	}
	static void test() {
		System.out.println("Printable.test() called.");
	}
}

/*
// Q. Will default methods cause ambiguity error?
// Yes, Error: Duplicate default methods named show are inherited from Printable and Displayable
class FirstClass implements Displayable, Printable {
	
}
*/

// Q. Which show() will be called? Interface or Class?
// If method overridden in sub-class, sub-class method will be called.
class SecondClass implements Displayable, Printable {
	@Override
	public void show() {
		System.out.println("SecondClass.show() called.");
	}
}

/*
// Q. Which show() will be called? Super-Interface or Super-Class?
//	Super-interfaces clash! Super-class wins!!
//	So super-class method gets higher priority while calling the method.
class SuperClass {
	public void show() {
		System.out.println("SuperClass.show() called.");
	}
}

class ThirdClass extends SuperClass implements Displayable {	
}
*/
/*
// Q. How to call super-interface default method?
//	SuperInterface.super.methodName()
class FourthClass implements Displayable, Printable {
	@Override
	public void show() {
		System.out.println("FourthClass.show() called.");
		Displayable.super.show();
		Printable.super.show();
	}
}
*/

public class Demo01Main {
	public static void main(String[] args) {
		/*
		SecondClass obj2 = new SecondClass();
		obj2.show(); // SecondClass.show()
		*/
		
		/*
		ThirdClass obj3 = new ThirdClass();
		obj3.show(); // SuperClass.show()
		*/
	
		/*
		FourthClass obj4 = new FourthClass();
		obj4.show();
		*/

		Displayable.test();
		Printable.test();
		//SecondClass.test();	// error: no such method in SecondClass
	}
}