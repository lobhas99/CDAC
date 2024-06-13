package com.sunbeam;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-26 08:42
 */

interface Shape {
	/*public static final*/ double PI = 3.142;
	/*public abstract*/ double calcArea();
	/*public abstract*/ double calcPeri();
}

// helper class for Shape interface
class Shapes {
	// calculate total perimeter of all shapes
	public static double calcTotalPeri(Shape[] arr) {
		double total = 0.0;
		for(Shape s : arr) {
			total = total + s.calcPeri();
		}
		return total;
	}
	
	// TODO calculate total area of all shapes
	// Lab Assignment
}

class Square implements Shape {
	private double side;
	public Square() {
	}
	public Square(double side) {
		this.side = side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	
	public double calcArea() {
		return this.side * this.side;
	}
	public double calcPeri() {
		return 4 * this.side;
	}
}

class Rectangle implements Shape {
	private double length, breadth;
	public Rectangle() {
	}
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	@Override
	public double calcArea() {
		return this.length * this.breadth;
	}
	@Override
	public double calcPeri() {
		return 2 * (this.length + this.breadth);
	}
}

class Triangle implements Shape {
	private double side1, side2, side3;
	public Triangle() {
	}
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	@Override
	public double calcArea() {
		// TODO Lab assignment
		return 0;
	}
	@Override
	public double calcPeri() {
		return this.side1 + this.side2 + this.side3;
	}
}

class Circle implements Shape {
	private double radius;
	public Circle() {
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		return Shape.PI * this.radius * this.radius;
	}
	@Override
	public double calcPeri() {
		return 2 * Shape.PI * this.radius;
	}
}

public class Demo01Main {
	public static void main(String[] args) {
		Shape s1 = new Square(10.0);
		System.out.println("Square Area: " + s1.calcArea());
		System.out.println("Square Peri: " + s1.calcPeri());
		
		Shape s2 = new Triangle(3, 4, 5);
		System.out.println("Triangle Area: " + s2.calcArea());
		System.out.println("Triangle Peri: " + s2.calcPeri());
		
		Shape s3 = new Circle(7.0);
		System.out.println("Circle Area: " + s3.calcArea());
		System.out.println("Circle Peri: " + s3.calcPeri());		
		
		Shape[] arr = new Shape[3];
		arr[0] = new Rectangle(6, 4);
		arr[1] = new Square(7);
		arr[2] = new Triangle(6, 8, 10);
		
		double totalPeri = Shapes.calcTotalPeri(arr);
		System.out.println("Total peri: " + totalPeri);
	}
}





