package com.sunbeam;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-26 10:58
 */

public class Demo02Main {
	public static void main(String[] args) {
		Person p1 = new Person("Nilesh", 40);
		p1.display();
		
		//Displayable d = p1; // up-casting
		//d.display();
		//Acceptable a = p1; // up-casting
		//a.accept();
		
		Person p2 = new Person();
		p2.accept();
		p2.display();
	}
}
