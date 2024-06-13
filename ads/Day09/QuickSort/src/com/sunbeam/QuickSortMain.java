package com.sunbeam;

import java.util.Arrays;

public class QuickSortMain {
	public static void quickSort(int arr[], int left, int right) {
		//0. stop if single element partition or invalid partition
		if(left >= right)
			return;
		//1. select pivot/referance/axis element from array
		//int pivot = arr[left];
		//2. arrange all smaller elements than pivot on left side of pivot
		//3. arrange all greater elements than pivot on right side of pivot
		int i = left, j = right;
		while(i < j) {
			// find element greater than pivot from left side
			for( ; i <= right && arr[i] <= arr[left] ; i++);
			// find element less or equal than pivot from right side
			for( ; arr[j] > arr[left] ; j--);
			// if i and j are not crossed
			if(i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		// if i and j are crossed
		int temp = arr[left];
		arr[left] = arr[j];
		arr[j] = temp;
		//4. sort both partitions(left and right partition of pivot) individually
		quickSort(arr, left, j-1);
		quickSort(arr, j+1, right);
	}

	public static void main(String[] args) {
		int arr[] = {66, 33, 99, 11, 77, 22, 55, 66, 88};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));
		
		quickSort(arr, 0, arr.length-1);
		
		System.out.println("Array after sort : " + Arrays.toString(arr));


	}

}
