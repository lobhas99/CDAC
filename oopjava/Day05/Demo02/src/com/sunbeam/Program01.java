package com.sunbeam;

public class Program01 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.displayEmployee();
		
		Employee e2 = new Employee();
		e2.acceptEmployee();
		e2.displayEmployee();
		
		Employee e3 = new Employee(2,"e2",20000,2,2,2002);
		e3.displayEmployee();
	}

}
