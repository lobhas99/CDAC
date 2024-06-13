package com.sunbeam.tester;

import com.sunbeam.Employee;
import com.sunbeam.Manager;
import com.sunbeam.Salesman;

public class Program04 {

	public static void main(String[] args) {
		Employee employee = new Manager();
		
		employee.acceptData();
		employee.displayData();
		//employee.calculateTotalSalary(); // NOT OK -> object slicing
		
		Manager manager = (Manager)employee; // Downcasting
		manager.calculateTotalSalary();
		
		employee = new Salesman(); // upcasting
		
		employee.acceptData();
		employee.displayData();
		//employee.calculateTotalCommission(); // NOT OK -> Object Slicing

		Salesman salesman = (Salesman)employee; // downcasting
		salesman.calculateTotalCommission();
	}

}
