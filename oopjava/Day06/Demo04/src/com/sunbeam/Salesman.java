package com.sunbeam;

import java.util.Scanner;

public class Salesman extends Employee {
	double commission;
	int salesCount;
	
	@Override
	public void acceptData(Scanner sc) {
		super.acceptData(sc);
		System.out.print("Enter commission - ");
		commission = sc.nextDouble();
		System.out.print("Enter salesCount - ");
		salesCount = sc.nextInt();
	}
	
	@Override
	public void calculateTotalSalary() {
		System.out.println("Salesman Total Salary - "+(salary + (commission*salesCount)));
	}

	@Override
	public String toString() {
		return super.toString()+", Salesman [commission=" + commission + ", salesCount=" + salesCount + "]";
	}

	
	
}
