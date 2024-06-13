package com.sunbeam;

public class SalesManager extends Manager {

	int comm;
	
	@Override
	public void acceptData() {
		super.acceptData();
		System.out.println("SalesManager accept");
	}
	
	@Override
	public void displayData() {
		super.displayData();
		System.out.println("SalesManager display");
	}
}
