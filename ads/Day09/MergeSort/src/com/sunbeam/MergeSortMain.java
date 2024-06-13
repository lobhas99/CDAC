package com.sunbeam;

import java.util.Arrays;

public class MergeSortMain {
	
	public static void mergeSort(int arr[], int left, int right) {
		//0. stop if single element partition
		if(left == right)
			return;
		//1. divide array into two partitions
		int mid = (left + right)/2;
		//2. sort both partitions individually by applying same method
		mergeSort(arr, left, mid);
		mergeSort(arr, mid+1, right);
		//3. merge two sorted partitions in temp array to get final sorted array
		int size = right - left + 1;
		int temp[] = new int[size];
		int i = left, j = mid + 1, k = 0;
		while(i <= mid && j <= right) {
			if(arr[i] < arr[j]) {
				temp[k] = arr[i];
				k++;
				i++;
			}
			else {
				temp[k] = arr[j];
				k++;
				j++;
			}
		}
		while(i <= mid) {
			temp[k] = arr[i];
			k++;
			i++;
		}
		while(j <= right) {
			temp[k] = arr[j];
			k++;
			j++;
		}
		//4. over write temp array into original array
		for(i = 0 ; i < size ; i++)
			arr[left + i] = temp[i];
	}

	public static void main(String[] args) {
		int arr[] = {6, 3, 9, 1, 7, 2, 8, 4, 5};
		
		System.out.println("Array before sort : " + Arrays.toString(arr));
		
		mergeSort(arr, 0, arr.length-1);
		
		System.out.println("Array after sort : " + Arrays.toString(arr));

	}
}



