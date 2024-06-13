package com.sunbeam;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-02 12:07
 */

/*
public class Demo06Main {
	// Queue<> provides FIFO behavior
		// offer() to add element in queue
		// poll() to delete element from queue
		// peek() to get topmost element in queue
		// These methods do not throw exception when failed -- return null.
	public static void main(String[] args) {
		Queue<String> q = new ArrayDeque<String>();
		Queue<String> q = new LinkedList<String>();
		
		q.offer("A");
		q.offer("B");
		q.offer("C");
		q.offer("D");
		System.out.println("Front Element: " + q.peek()); // A
		while(!q.isEmpty()) {
			String ele = q.poll();
			System.out.println("Popped Element: " + ele); // A, B, C, D
		}
		
		System.out.println("Front Element in Empty Queue: " + q.peek()); // null
		System.out.println("Deleting from Empty Queue: " + q.poll()); // null
	}
}
*/

public class Demo06Main {
	// Queue<> provides FIFO behavior
		// add() to add element in queue
		// remove() to delete element from queue
		// element() to get topmost element in queue
		// These methods throw exception when failed.
	public static void main(String[] args) {
		//Queue<String> q = new ArrayDeque<String>();
		Queue<String> q = new LinkedList<String>();
		
		q.add("A");
		q.add("B");
		q.add("C");
		q.add("D");
		System.out.println("Front Element: " + q.element()); // A
		while(!q.isEmpty()) {
			String ele = q.remove();
			System.out.println("Popped Element: " + ele); // A, B, C, D
		}
		
		System.out.println("Front Element in Empty Queue: " + q.element()); // throw exception
		System.out.println("Deleting from Empty Queue: " + q.remove()); // throw exception
	}
}












