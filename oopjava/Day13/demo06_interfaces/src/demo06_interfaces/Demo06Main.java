package demo06_interfaces;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-03 12:29
 */
interface Shape {
	final static double PI = 3.142;
	double calcArea();
	
	// Since Java 8 -- default method implementation can be written in interfaces.
	// 	Such methods are not mandatory to be overridden in sub-classes.
	//	If not overridden in sub-class, default implementation from interface is considered.
	default double calcPeri() {
		return 0.0;
	}
	
	// Since Java 8 -- static method implementation is allowed in interfaces.
	public static double calcTotalArea(Shape[] arr) {
		double total = 0.0;
		for (Shape sh : arr)
			total += sh.calcArea();
		return total;
	}
}

class Rectangle implements Shape {
	private double length, breadth;
	public Rectangle() {
	}
	public Rectangle(double length, double breadth) {
		super();
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
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}
	public double calcArea() {
		return this.length * this.breadth;
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
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	public double calcArea() {
		return PI * this.radius * this.radius;
	}
	
	@Override
	public double calcPeri() {
		return 2 * PI * this.radius;
	}
}

public class Demo06Main {
	public static void main(String[] args) {
		Shape[] arr = {
			new Rectangle(4, 2),
			new Circle(7),
			new Rectangle(9, 5),
			new Circle(70),
			new Rectangle(7, 3)
		};
		double totalArea = Shape.calcTotalArea(arr);
		System.out.println("Total Area of all shapes: " + totalArea);
		
		Shape s1 = new Rectangle(30, 20);
		System.out.println("Rectangle Peri: " + s1.calcPeri());
		Shape s2 = new Circle(14);
		System.out.println("Circle Peri: " + s2.calcPeri());
	}
}

















