package com.sunbeam.tester;

import com.sunbeam.Employee;
import com.sunbeam.Manager;
import com.sunbeam.Salesman;

public class Program05 {

	public static void main(String[] args) {
		// Employee employee = new Employee();
		Employee employee = new Manager();
		//Employee employee = new Salesman();
		employee.acceptData();
		employee.displayData();

		// ClassCastException
		// to avoid the ClassCastException check for the instance using instanceof
		// operator
		if (employee instanceof Manager) {
			Manager manager = (Manager) employee; // Downcasting
			manager.calculateTotalSalary();
		}

		if (employee instanceof Salesman) {
			Salesman salesman = (Salesman) employee;
			salesman.calculateTotalCommission();
		}
	}

}
