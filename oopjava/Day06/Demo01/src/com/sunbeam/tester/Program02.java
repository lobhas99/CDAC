package com.sunbeam.tester;

import com.sunbeam.Employee;
import com.sunbeam.Manager;
import com.sunbeam.Salesman;

public class Program02 {

	public static void main(String[] args) {
	Manager manager = new Manager();
	manager.acceptData();
	manager.displayData();
	
	Salesman salesman = new Salesman();
	salesman.acceptData();
	salesman.displayData();

	}

}
