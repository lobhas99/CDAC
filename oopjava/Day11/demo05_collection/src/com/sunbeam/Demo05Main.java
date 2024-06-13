package com.sunbeam;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-01 12:15
 */

public class Demo05Main {
	public static void main(String[] args) {
		Collection<String> c = new LinkedList<>();
		//Collection<String> c = new ArrayList<>();
		//Collection<String> c = new HashSet<>();
		//Collection<String> c = new ArrayDeque<>();
		c.add("India");
		c.add("Africa");
		c.add("Australia");
		c.add("Germany");
		c.add("Japan");
		System.out.println("Size: " + c.size()); // 5
		System.out.println("Elements: " + c.toString());
		
		c.remove("Australia");
		System.out.println("Size: " + c.size()); // 4
		System.out.println("Elements: " + c.toString());
		
		String key = "Japan";
		if(c.contains(key))
			System.out.println("Key found.");
		else
			System.out.println("Key not found.");
		
		Collection<String> c1 = new ArrayList<>();
		c1.add("Pakistan");
		c1.add("China");
		c1.add("Russia");
		c.addAll(c1);
		System.out.println("Size: " + c.size()); // 7
		System.out.println("Elements: " + c.toString());	
		
		Collection<String> c2 = new ArrayList<>();
		c2.add("Pakistan");
		c2.add("China");
		c2.add("Africa");
		c.removeAll(c2);
		System.out.println("Size: " + c.size()); // 7
		System.out.println("Elements: " + c.toString());	
		
		Iterator<String> itr = c.iterator();
		while(itr.hasNext()) {
			String ele = itr.next();
			System.out.println(ele);
		}
		
		c.clear();
		System.out.println("Size: " + c.size()); // 0
		System.out.println("Elements: " + c.toString());
		System.out.println("Is Empty: " + c.isEmpty());
	}
}

















