package com.sunbeam;

import java.util.Arrays;

public class SelectionSortMain {
	
	public static void selectionSort(int arr[], int N) {
		//1. count number of passes and select one position(index) of array
		for(int i = 0 ; i < N-1 ; i++) {
			//2. count number of comparisions
			for(int j = i + 1 ; j < N ; j++) {
				//3. compare ith element with jth element
				if(arr[i] > arr[j]) {
					// swap ith and jth element
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {44, 11, 55, 22, 66, 33};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));
		selectionSort(arr, arr.length);
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}

}
