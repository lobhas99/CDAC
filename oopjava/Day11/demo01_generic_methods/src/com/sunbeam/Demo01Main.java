package com.sunbeam;

import java.lang.reflect.Field;
import java.util.Date;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-01 08:01
 */

public class Demo01Main {
	public static <T> void swap(T a, T b) {
		T t = a;
		a = b;
		b = t;
		System.out.println("After Swap: a = " + a + ", b = " + b);
	}
	public static void main(String[] args) {
		Integer i1 = 10, i2 = 20;
		System.out.println("Before Swap: a = " + i1 + ", b = " + i2);
		swap(i1, i2);

		Double d1 = 1.1, d2 = 2.2;
		System.out.println("Before Swap: a = " + d1 + ", b = " + d2);
		swap(d1, d2);
		
		Date obj1 = new Date();
		String str2 = "Hello DAC";
		System.out.println("Before Swap: a = " + obj1 + ", b = " + str2);
		swap(obj1, str2); // auto-detected type --> swap(Serializable, Serializable);
		Demo01Main.<Object>swap(obj1, str2); // given type --> swap(Object, Object);
		//Demo01Main.<Date>swap(obj1, str2); // given type --> swap(Date, Date); -- compiler error
	}
}








