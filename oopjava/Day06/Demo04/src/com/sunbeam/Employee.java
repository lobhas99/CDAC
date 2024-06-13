package com.sunbeam;

import java.util.Scanner;

abstract public class Employee {
	int empid;
	String name;
	double salary;
	
	public void acceptData(Scanner sc) {
		System.out.print("Enter id - ");
		empid = sc.nextInt();
		System.out.print("Enter name - ");
		name = sc.next();
		System.out.print("Enter Salary - ");
		salary = sc.nextDouble();
	}
	
	public abstract void calculateTotalSalary();

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
