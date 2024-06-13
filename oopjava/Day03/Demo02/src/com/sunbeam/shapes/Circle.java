package com.sunbeam.shapes;

import java.util.Scanner;

 class Circle {
	int radius;
	
	 public void acceptRadius() {
		//Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the radius - ");
		//radius = sc.nextInt();
		radius = new Scanner(System.in).nextInt();
	}
	
	public void calculateArea() {
		System.out.println("Circle Area - "+(3.14 * radius * radius));
	}
}
