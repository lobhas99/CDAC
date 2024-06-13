package com.sunbeam.tester;

import com.sunbeam.Employee;

public class Program01 {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "e1", 10000);
		e1.displayData();
		
		Employee e2 = new Employee();
		e2.acceptData();
		e2.displayData();

	}

}
