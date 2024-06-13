package com.sunbeam;

import java.util.Scanner;

//Employee has-a DateOfJoining

public class Employee {
	private int empid;
	private String name;
	private double salary;

	// reference of Date class
	private Date doj; // Association
	
	//reference of Vehcile class
	private Vehicle vehicle; // Association

	public Employee() {
		this.doj = new Date(); // composition implementation
	}

	public Employee(int empid, String name, double salary, int day, int month, int year) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.doj = new Date(day, month, year); // composition implementation
	}
		
	public Employee(int empid, String name, double salary, int day, int month, int year, Vehicle vehicle) {
		this(empid,name,salary,day,month,year);
		this.vehicle = vehicle; // Aggegration implementation
	}

	public void acceptEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter empid - ");
		empid = sc.nextInt();
		System.out.print("Enter name - ");
		name = sc.next();
		System.out.print("Enter salary - ");
		salary = sc.nextDouble();
		System.out.println("Enter Date of Joining - ");
		doj.acceptDate();
	}
	
	public void acceptVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
		if(vehicle!=null)
		vehicle.acceptVehicle();
	}

	public void displayEmployee() {
		System.out.println("Empid - " + empid);
		System.out.println("Name - " + name);
		System.out.println("Salary - " + salary);
		System.out.print("Date of joining - ");
		doj.displayDate();
		System.out.println();
		if(vehicle!=null)
			vehicle.displayVehicle();
	}

}
