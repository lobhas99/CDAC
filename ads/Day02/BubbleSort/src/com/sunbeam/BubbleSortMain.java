package com.sunbeam;

import java.util.Arrays;

public class BubbleSortMain {
	
	public static void bubbleSort(int arr[], int N) {
		int passes = 0, comps = 0;
		//1. count number of passes
		for(int i = 1 ; i < N ; i++) {
			passes++;
			//2. count number of comparisions per pass
			for(int j = 0 ; j < N - 1 ; j++) {
				comps++;
				//3. compare two consecutive elements
				if(arr[j] > arr[j+1]) {
					//4. swap left and right element
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Number of Passes : " + passes);
		System.out.println("Number of comps : " + comps);
	}
	
	public static void improvedBubbleSort(int arr[], int N) {
		int passes = 0, comps = 0;
		//1. count number of passes
		for(int i = 1 ; i < N ; i++) {
			passes++;
			//2. count number of comparisions per pass
			for(int j = 0 ; j < N - i ; j++) {
				comps++;
				//3. compare two consecutive elements
				if(arr[j] > arr[j+1]) {
					//4. swap left and right element
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Number of Passes : " + passes);
		System.out.println("Number of comps : " + comps);
	}
	
	public static void furtherImprovedBubbleSort(int arr[], int N) {
		int passes = 0, comps = 0, flag;
		//1. count number of passes
		for(int i = 1 ; i < N ; i++) {
			flag = 0;
			passes++;
			//2. count number of comparisions per pass
			for(int j = 0 ; j < N - i ; j++) {
				comps++;
				//3. compare two consecutive elements
				if(arr[j] > arr[j+1]) {
					//4. swap left and right element
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = 1;
				}
			}
			if(flag == 0)
				break;
		}
		System.out.println("Number of Passes : " + passes);
		System.out.println("Number of comps : " + comps);
	}

	public static void main(String[] args) {
		//int arr[] = {33, 22, 66, 55, 44, 11};
		int arr[] = {11, 22, 33, 44, 55, 66};
		System.out.println("Array before sort : " + Arrays.toString(arr));
		
		//bubbleSort(arr, arr.length);
		//improvedBubbleSort(arr, arr.length);
		furtherImprovedBubbleSort(arr, arr.length);
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}

}
