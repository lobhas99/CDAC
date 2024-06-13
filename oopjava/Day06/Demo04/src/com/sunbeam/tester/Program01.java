package com.sunbeam.tester;

import java.util.Scanner;

import com.sunbeam.Employee;
import com.sunbeam.Manager;
import com.sunbeam.Salesman;


public class Program01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Employee employee = new Employee(); // NOT OK 
		
		//Employee employee = new Manager(); // upcasting
		Employee employee = new Salesman(); // upcasting
		
		
		employee.acceptData(sc);
		System.out.println(employee);
		employee.calculateTotalSalary();
		
		sc.close();

	}

}
