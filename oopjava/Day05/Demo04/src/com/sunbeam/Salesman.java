package com.sunbeam;

public class Salesman extends Employee {

	int comm;
	
	@Override
	public void acceptData() {
		super.acceptData();
		System.out.println("SalesMan accept");
	}
	
	@Override
	public void displayData() {
		super.displayData();
		System.out.println("SalesMan display");
	
	}
}
