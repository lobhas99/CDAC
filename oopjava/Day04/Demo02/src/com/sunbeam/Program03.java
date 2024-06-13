package com.sunbeam;
import com.sunbeam.entity.Point;

// Ragged Array - Reference types
public class Program03 {

	public static void main(String[] args) {
	
		Point arr1[][] = new Point[2][];
		
		arr1[0] = new Point[2];
		arr1[1] = new Point[3];
				
		arr1[0][0] = new Point(1, 2);
		arr1[0][1] = new Point(3, 4);
		arr1[1][0] = new Point(5, 6);
		arr1[1][1] = new Point(7, 8);
		arr1[1][2] = new Point(9, 10);
		
		/*
		  for(int row = 0; row < 2 ; row++) {
			for(int col = 0; col<arr1[row].length; col++) {
				arr1[row][col].displayPoint();
			}
		}
		 */
		
		for(int row = 0; row < 2 ; row++) {
			Point arr[] = arr1[row];
			for(int col = 0; col<arr.length; col++) {
				//arr1[row][col].displayPoint();
				arr[col].displayPoint();
			}
		}
		
		System.out.println();
		System.out.println("using for-each");
		
		for(Point arr[]: arr1)
			for(Point element : arr)
				element.displayPoint();
	}

}
