package com.sunbeam;

import java.util.Scanner;

public class Person {
	String name;
	String mobile;
	
	public Person() {
		System.out.println("Person Parameterless Ctor");
	}
	
	public Person(String name, String mobile) {
		System.out.println("Person Parameterized Ctor");
		this.name = name;
		this.mobile = mobile;
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name - ");
		name = sc.next();
		System.out.print("Enter mobile - ");
		mobile = sc.next();
		
	}
	
	public void displayData() {
		System.out.println("Name - "+name);
		System.out.println("Mobile - "+mobile);
	}
	
	
}
