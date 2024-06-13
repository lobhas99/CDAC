package com.sunbeam.tester;

//import com.sunbeam.shapes.Circle;
//import com.sunbeam.shapes.Rectangle;

// OR

import com.sunbeam.shapes.*;

public class Tester {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.acceptRadius();
		circle.calculateArea();
		
		Rectangle rectangle = new Rectangle();
		rectangle.acceptData();
		rectangle.displayData();
	}

}
