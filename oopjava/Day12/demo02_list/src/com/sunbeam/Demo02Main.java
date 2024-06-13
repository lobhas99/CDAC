package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-02 09:32
 */

public class Demo02Main {
	public static void main(String[] args) {
		List<String> list;
		//list = new ArrayList<String>();		
		//list = new LinkedList<String>();		
		list = new Vector<String>();			

		list.add("India");
		list.add("Nepal");
		list.add("Bhutan");
		list.add("Lanka");
		list.add("Maldives");
		list.add("India");	// duplicate is allowed
	
		System.out.println(list.toString());
		
		System.out.println("Using for-each loop: ");
		for (String ele : list)
			System.out.println(ele);
		
		System.out.println("Using Iterator: ");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String ele = itr.next();
			System.out.println(ele);
		}
		
		// random access
		int index = 2;
		list.set(index, "Bangla");
		System.out.println(list.toString());
		
		String elem = list.get(index);
		System.out.println("Element at " + index + " : " + elem);
		
		elem = list.remove(index);
		System.out.println("Element " + elem + " is removed from index " + index);
		System.out.println(list.toString());
		
		list.add(index, "Bhutan");
		System.out.println(list.toString());
		
		// traverse list using random access
		System.out.println("Traverse list using random access: ");
		for(int i=0; i<list.size(); i++) {
			String ele = list.get(i);
			System.out.println(ele);
		}

		// searching in list
		String key = "India"; // sc.next();
		index = list.indexOf(key); // returns index of first occurrence of the element
			/*
			// logical implementation of ArrayList.indexOf() method
			for(int i=0; i<this.size(); i++) {
				ele = this.get(i);
				if(key.equals(ele))
					return i;
			}
			return -1;
			*/
		if(index == -1)
			System.out.println("Element is not found in list.");
		else {
			String ele = list.get(index);
			System.out.println("Element " + ele + " is found at index: " + index);
		}

		index = list.lastIndexOf(key); // returns index of last occurrence of the element
			/*
			// logical implementation of ArrayList.indexOf() method
			for(int i=this.size()-1; i>=0; i--) {
				ele = this.get(i);
				if(key.equals(ele))
					return i;
			}
			return -1;
			*/
		if(index == -1)
			System.out.println("Element is not found in list.");
		else {
			String ele = list.get(index);
			System.out.println("Element " + ele + " is found at index: " + index);
		}
		
		// bi-directional traversal
		System.out.println("Forward traversal using ListIterator: ");
		ListIterator<String> fitr = list.listIterator();
		while(fitr.hasNext()) {
			String ele = fitr.next();
			System.out.println(ele);
		}
		
		System.out.println("Reverse traversal using ListIterator: ");
		ListIterator<String> ritr = list.listIterator(list.size());
		while(ritr.hasPrevious()) {
			String ele = ritr.previous();
			System.out.println(ele);
		}
	}
}


















