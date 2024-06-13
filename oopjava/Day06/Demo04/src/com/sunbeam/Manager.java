package com.sunbeam;

import java.util.Scanner;

public class Manager extends Employee {
	double bonus;
	
	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.print("Enter Bonus - ");
		bonus = sc.nextDouble();
	}
		
	@Override
	public void calculateTotalSalary() {
		System.out.println("Manager Total Salary - "+(salary+bonus));
		
	}

	@Override
	public String toString() {
		return super.toString()+", Manager [bonus=" + bonus + "]";
	}
	
	

	

}
