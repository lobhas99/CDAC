package com.sunbeam;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-02 12:19
 */

public class Demo07Main {
	/*
	// Deque as Queue -- FIFO
	public static void main(String[] args) {
		Deque<String> q = new ArrayDeque<String>();
		//Deque<String> q = new LinkedList<String>();
		
		q.offerLast("A");
		q.offerLast("B");
		q.offerLast("C");
		q.offerLast("D");
		System.out.println("Front element: " + q.peekFirst());
		
		while(!q.isEmpty()) {
			String ele = q.pollFirst();
			System.out.println("Popped: " + ele);
		}
		
		System.out.println("Front element in Empty queue: " + q.peekFirst()); //null
	}
	*/
	
	// Deque as Stack -- LIFO
	public static void main(String[] args) {
		//Deque<String> s = new ArrayDeque<String>();
		Deque<String> s = new LinkedList<String>();
		
		s.offerFirst("A");
		s.offerFirst("B");
		s.offerFirst("C");
		s.offerFirst("D");
		System.out.println("Top element: " + s.peekFirst());
		
		while(!s.isEmpty()) {
			String ele = s.pollFirst();
			System.out.println("Popped: " + ele);
		}
		
		System.out.println("Top element in Empty stack: " + s.peekFirst()); //null
	}
	
}
