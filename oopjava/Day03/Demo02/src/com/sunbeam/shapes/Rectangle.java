package com.sunbeam.shapes;

import java.util.Scanner;

public class Rectangle {
	int length;
	int breadth;
	
	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter length - ");
		length = sc.nextInt();
		
		System.out.print("Enter breadth - ");
		breadth = sc.nextInt();
	}
	
	public void displayData() {
		System.out.println("Area of Rectangle - "+ (length*breadth));
	}
}
