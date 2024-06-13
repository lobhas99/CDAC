package com.sunbeam;

import java.util.Scanner;

public class Vehicle {
	private String name;
	private String veh_number;

	
	public void acceptVehicle() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Vehicle Name - ");
		name = sc.next();
		System.out.print("Vehicle Number - ");
		veh_number = sc.next();
	}
	
	public void displayVehicle() {
		System.out.println("Vehicle Name - "+name);
		System.out.println("Vehicle Number - "+veh_number);
	}
	
	
}
