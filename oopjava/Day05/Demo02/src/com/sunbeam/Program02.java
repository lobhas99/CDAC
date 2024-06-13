package com.sunbeam;

import java.util.Calendar;

public class Program02 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.acceptEmployee();
		Vehicle vehicle = new Vehicle();
		
		e1.acceptVehicle(vehicle);
		e1.displayEmployee();
		
		Vehicle vehicle2 = new Vehicle();
		vehicle2.acceptVehicle();
		Employee e2 = new Employee(2,"e2",20000,2,2,2002,vehicle2);
		e2.displayEmployee();

	}

}
