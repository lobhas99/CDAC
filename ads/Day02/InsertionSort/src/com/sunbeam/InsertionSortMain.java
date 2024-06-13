package com.sunbeam;

import java.util.Arrays;

public class InsertionSortMain {
	
	public static void insertionSort(int arr[], int N) {
		//1. count number of passes
		for(int i = 1 ; i < N ; i++) {
			//2. take backup of ith element
			int temp = arr[i];
			int j;
			//3. compare backuped element with all its neighbours
			for(j = i-1 ; j >= 0 && arr[j] > temp ; j--) {
				//4. move jth element one position ahead
				arr[j+1] = arr[j];
			}
			//5. insert backuped element at its appropriate position
			arr[j+1] = temp;
		}
	}

	public static void main(String[] args) {
		int arr[] = {55, 44, 22, 66, 11, 33};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));

		insertionSort(arr, arr.length);
		
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}

}
