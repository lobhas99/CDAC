package com.sunbeam;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.TreeSet;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-03 10:08
 */

public class Demo04Main {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("P");
		set.add("S");
		set.add("M");
		set.add("N");
		set.add("U");
		set.add("B");
		set.add("D");
		set.add("A");
	
		System.out.println(set);
		
		// SortedSet<> methods
		System.out.println("First: " + set.first()); // A
		System.out.println("Last: " + set.last()); // U
		System.out.println("Head Set: " + set.headSet("M")); // A, B, D (M is excluded)
		System.out.println("Tail Set: " + set.tailSet("P")); // P, S, U (P is included)
		System.out.println("Sub Set: " + set.subSet("D", "P")); // D, M, N (D included / P excluded)
		
		// NavigableSet<> methods
		System.out.println("Higher than N: " + set.higher("N")); // P
		System.out.println("Lower than M: " + set.lower("M")); // D
		System.out.println("Higher than O: " + set.higher("O")); // P
		System.out.println("Lower than X: " + set.lower("X")); // U
		
		System.out.println("Traversal using Descending Iterator: ");
		Iterator<String> itr = set.descendingIterator();
		while(itr.hasNext()) {
			String ele = itr.next();
			System.out.print(ele + ", ");
		}
		System.out.println();
		
		System.out.println("DescendingSet -- New set in which elements placed in reverse order: ");
		NavigableSet<String> revSet = set.descendingSet();
		System.out.println(revSet);
	}
}












