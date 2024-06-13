package com.sunbeam;

import java.io.IOException;
import java.sql.SQLException;

public class Employee {
	String name;
	int id;
	double salary;

	public void acceptData() {
		System.out.println("Employee accept");
	}

	public void displayData() {
		System.out.println("Employee display");
	}
}
