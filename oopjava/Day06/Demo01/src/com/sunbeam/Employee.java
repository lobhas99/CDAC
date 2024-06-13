package com.sunbeam;

import java.util.Scanner;

public class Employee {
	int empid;
	String name;
	double salary;
	
	public Employee() {
	}
	
	public Employee(int empid, String name, double salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Empid - ");
		empid = sc.nextInt();
		
		System.out.print("Enter Name - ");
		name = sc.next();
		
		System.out.print("Enter Salary - ");
		salary = sc.nextDouble();
	}
	
	public void displayData() {
		System.out.println("Empid - "+empid);
		System.out.println("Name - "+name);
		System.out.println("Salary - "+salary);
	}
	
	
}
