package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-02 11:24
 */

public class Demo04Main {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		System.out.println(list1); // capacity=10, size=0
		Collections.addAll(list1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(list1); // capacity=10, size=10
		list1.add(11);	// arraylist grows by half of its current capacity.
		list1.add(12);	// new capacity = old capacity + old capacity / 2.
		System.out.println(list1); // capacity=15, size=12
		Collections.addAll(list1, 13, 14, 15);
		System.out.println(list1); // capacity=15, size=15
		list1.add(16);	// arraylist grows by half of its current capacity.
		System.out.println(list1); // capacity=22, size=16
		
		// How to use ArrayList is multi-threaded application (with Synchronization)?
		List<Integer> list2 = Collections.synchronizedList(list1);
		list2.add(17); // list2 is synchronized (thread-safe) -- internally adds sync logic.
		System.out.println(list2);
	}

	/*
	public static void main(String[] args) {
		Vector<Integer> list1 = new Vector<Integer>();
		System.out.println(list1); // capacity=10, size=0
		System.out.println("capacity = " + list1.capacity() + " | size = " + list1.size());
		Collections.addAll(list1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(list1); // capacity=10, size=10
		System.out.println("capacity = " + list1.capacity() + " | size = " + list1.size());
		list1.add(11);	// vector grows by its current capacity.
		list1.add(12);	// new capacity = old capacity + old capacity.
		System.out.println(list1); // capacity=20, size=12
		System.out.println("capacity = " + list1.capacity() + " | size = " + list1.size());
		Collections.addAll(list1, 13, 14, 15, 16, 17, 18, 19, 20);
		System.out.println(list1); // capacity=20, size=20
		list1.add(21);	// vector grows by its current capacity.
		System.out.println(list1); // capacity=40, size=21
		System.out.println("capacity = " + list1.capacity() + " | size = " + list1.size());
		
		// Enumeration is predecessor of Iterator (since Java 1.0)
		Enumeration<Integer> en = list1.elements();
		while(en.hasMoreElements()) {
			Integer ele = en.nextElement();
			System.out.println(ele);
		}
	}
	*/
}














