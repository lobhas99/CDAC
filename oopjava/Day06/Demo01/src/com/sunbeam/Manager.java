package com.sunbeam;

import java.util.Scanner;

public class Manager extends Employee{
	double bonus;
	
	@Override
	public void acceptData() {
		super.acceptData();
		System.out.print("Enter bonus - ");
		bonus = new Scanner(System.in).nextDouble();
	}
	
	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Bonus - "+bonus);
	}
	
	public void calculateTotalSalary() {
		System.out.println("Total Salary  - "+(salary + bonus));
	}
	
	
}
