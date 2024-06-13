package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-03 08:15
 */

public class Demo01Main {
	// fail-fast iterator
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		Collections.addAll(list1, 10, 20, 30, 40, 50);
		System.out.println("Traversing with fail-fast Iterator:");
		Iterator<Integer> itr1 = list1.iterator();
		while(itr1.hasNext()) {
			Integer ele = itr1.next();
			System.out.println(ele);
			if(ele == 40)
				list1.add(60);
		}
	}
	
	/*
	// fail-safe iterator
	public static void main(String[] args) {
		List<Integer> list2 = new CopyOnWriteArrayList<Integer>();
		Collections.addAll(list2, 10, 20, 30, 40, 50);
		System.out.println("Traversing with fail-safe Iterator: (concurrent Changes not visible): ");
		Iterator<Integer> itr2 = list2.iterator();
		while(itr2.hasNext()) {
			Integer ele = itr2.next();
			System.out.println(ele);
			if(ele == 40)
				list2.add(60);
		}
		System.out.println("Traversing again - Concurrent changes will be available in new iterator: ");
		Iterator<Integer> itr3 = list2.iterator();
		while(itr3.hasNext()) {
			Integer ele = itr3.next();
			System.out.println(ele);
		}
	}
	*/
}
