package com.sunbeam;

import java.util.Scanner;

public class Salesman extends Employee {
	double comm;
	int salesCount;

	@Override
	public void acceptData() {
		super.acceptData();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Commission - ");
		comm = sc.nextDouble();

		System.out.print("Enter salesCount - ");
		salesCount = sc.nextInt();

	}

	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Commission - " + comm);
		System.out.println("Sales Count - " + salesCount);
	}
	
	public void calculateTotalCommission() {
		System.out.println("Total Commission - "+(comm * salesCount));
	}
}
