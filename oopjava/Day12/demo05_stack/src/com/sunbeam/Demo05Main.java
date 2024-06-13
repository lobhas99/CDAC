package com.sunbeam;

import java.util.Stack;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-02 12:02
 */

public class Demo05Main {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		s.push("E");
		System.out.println("Topmost: " + s.peek()); // E
		while(!s.isEmpty()) {
			String ele = s.pop();
			System.out.println("Popped: " + ele); // E, D, C, B, A
		}
	}
}














