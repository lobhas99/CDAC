package com.sunbeam;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-02 12:39
 */

public class Demo08Main {
	/*
	public static void main(String[] args) {
		// Natural ordering of String
		Queue<String> q = new PriorityQueue<String>();
		q.offer("B");
		q.offer("X");
		q.offer("P");
		q.offer("D");
		q.offer("A");
		
		while(!q.isEmpty()) {
			String ele = q.poll();
			System.out.println("Popped: " + ele);
		}
	}
	*/

	public static void main(String[] args) {
		class StringDescComparator implements Comparator<String> {
			@Override
			public int compare(String s1, String s2) {
				int diff = - s1.compareTo(s2);
				return diff;
			}
		}
		// as per given comparator order
		Queue<String> q = new PriorityQueue<String>(new StringDescComparator());
		q.offer("B");
		q.offer("X");
		q.offer("P");
		q.offer("D");
		q.offer("A");
		
		while(!q.isEmpty()) {
			String ele = q.poll();
			System.out.println("Popped: " + ele);
		}
	}

}





