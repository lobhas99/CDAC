package com.sunbeam;

// Ragged Array
public class Program04 {

	public static void main(String[] args) {
		int arr1[][] = new int[2][]; // Ragged Array
		arr1[0] = new int[2];
		arr1[1] = new int[3];
		
		arr1[0][0] = 10;
		arr1[0][1] = 20;
		arr1[1][0] = 30;
		arr1[1][1] = 40;
		arr1[1][2] = 50;
		
		for(int row = 0; row < 2;row++) {
			for(int col = 0; col<arr1[row].length ; col++)
				System.out.println("element =  "+arr1[row][col]);
		}
		
		System.out.println();
		System.out.println("usnig for-each");
		
		for(int arr[]:arr1)
			for(int element:arr)
				System.out.println("element = "+element);
			
	}

}
