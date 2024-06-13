package com.sunbeam;

import java.io.IOException;
import java.sql.SQLException;

public class Manager extends Employee {

	double bonus;
	
	@Override
	public void acceptData() {
		super.acceptData();
	}
	
	@Override
	public void displayData() {
		super.displayData();
		System.out.println("Manager display");
	}
		
}
