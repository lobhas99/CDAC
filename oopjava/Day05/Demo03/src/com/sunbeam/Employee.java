package com.sunbeam;

import java.util.Scanner;

public class Employee extends Person // inheritance
{
	int empid;
	double salary;

	public Employee() {
		System.out.println("Employee Parameterless Ctor");
	}

	public Employee(int empid, double salary) {
		System.out.println("Employee Parameterized Ctor-1");
		this.empid = empid;
		this.salary = salary;
	}

	public Employee(int empid,String name, String mobile, double salary) {
		super(name, mobile);
		System.out.println("Employee Parameterized Ctor-2");
		this.empid = empid;
		this.salary = salary;
	}

	@Override
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Empid - ");
		empid = sc.nextInt();
		
		super.acceptData();
		
		System.out.print("Enter Salary - ");
		salary = sc.nextDouble();
	}
	
	@Override
	public void displayData() {
		System.out.println("Empid - " + empid);
		super.displayData();
		System.out.println("Salary - " + salary);
	}
	
	

}
