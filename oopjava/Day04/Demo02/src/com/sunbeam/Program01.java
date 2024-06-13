package com.sunbeam;
import com.sunbeam.entity.Point;

// Single Dimension Array - Reference types
public class Program01 {

	public static void main(String[] args) {
	
		Point arr1[] = new Point[5];
		
		arr1[0] = new Point(1,2);
		arr1[1] = new Point(3,4);
		arr1[2] = new Point(5,6);
		arr1[3] = new Point(7,8);
		arr1[4] = new Point(9,10);
		
		for (int i = 0; i < 5; i++)
			arr1[i].displayPoint();
		
		System.out.println();
		System.out.println("using for-each");
		
		for(Point element: arr1)
			element.displayPoint();
	}

}
