package com.sunbeam;

 final class Base {
	public static int num1=10;
	// If implementation of superclass method is 100% Complete then make it is as final
	public final void method1() {
		Base b = new Base();
		System.out.println("Inside Method-1"+Base.num1);
	}
	public void method2() {
		System.out.println("Inside Method-2");
	}
}

class Derived extends Base // NOT Allowed
{
	
	@Override
	public void method1() {
		System.out.println("Inside Derived Method-1");
	}
	
	@Override
	public void method2() {
		
		System.out.println("Inside Derived Method-2");
	}
}

public class Program {

	public static void main(String[] args) {
	
	Program p = new Program();
	}

}
