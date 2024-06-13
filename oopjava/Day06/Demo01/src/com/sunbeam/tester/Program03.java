package com.sunbeam.tester;

import com.sunbeam.Employee;
import com.sunbeam.Manager;
import com.sunbeam.Salesman;

public class Program03 {

	public static void main(String[] args) {
		Employee employee;
		//employee = new Employee();
		//employee = new Manager(); // upcasting
		employee = new Salesman(); // upcasting
				
		employee.acceptData();
		employee.displayData();

	}

}
