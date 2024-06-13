package com.sunbeam;

class Test1 {

	public void method1() {
		System.out.println("Inside Method-1");
		Singleton s5 = Singleton.getSingleton();
	}

}

class Test2 {
	public void method2() {
		System.out.println("Inside Method-2");
		Singleton s6 = Singleton.getSingleton();
	}
}

public class Program01 {

	public static void main(String[] args) {
//		Singleton s1 = Singleton.getInstance();
//		Singleton s2 = Singleton.getInstance();
//		Singleton s3 = Singleton.getInstance();
//		Singleton s4 = Singleton.getInstance();
//		
//		new Test1().method1();
//		
//		new Test2().method2();
		
		Singleton s1 = Singleton.getSingleton();
		Singleton s2 = Singleton.getSingleton();
		Singleton s3 = Singleton.getSingleton();
		Singleton s4 = Singleton.getSingleton();
		

	}

}
