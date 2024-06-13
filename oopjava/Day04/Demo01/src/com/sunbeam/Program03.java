package com.sunbeam;

// MultiDimension Array
public class Program03 {

	public static void main(String[] args) {
		int arr1[][] = new int[2][3];
		arr1[0][0] = 10;
		arr1[0][1] = 20;
		arr1[0][2] = 30;
		arr1[1][0] = 40;
		arr1[1][1] = 50;
		arr1[1][2] = 60;
		
		for(int row=0; row<2; row++)
			for(int col=0;col<3;col++)
				System.out.println("element = "+arr1[row][col]);
		
		System.out.println();
		System.out.println("Using for-each");
		
		for(int[] arr : arr1)
			for(int element : arr)
				System.out.println("element = "+ element);
	}

}
