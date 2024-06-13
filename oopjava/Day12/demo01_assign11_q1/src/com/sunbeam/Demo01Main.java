package com.sunbeam;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-02 08:14
 */

public class Demo01Main {
    static <T> void selectionSort(T[] arr, Comparator<T> c) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(c.compare(arr[i], arr[j]) > 0) {
                   T temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Number[] arr = { 1.0, 1.4, 1.3, 1.2 };
        System.out.println("Array class name: " + arr.getClass().getName());
        
        class DoubleComparator implements Comparator<Number> {
            public int compare(Number x, Number y) {
                return Double.compare(x.doubleValue(),y.doubleValue());
            }
        }
        
        System.out.println("Before Sort: " + Arrays.toString(arr));
        selectionSort(arr, new DoubleComparator());
        System.out.println("After Sort: " + Arrays.toString(arr));
    }
}
