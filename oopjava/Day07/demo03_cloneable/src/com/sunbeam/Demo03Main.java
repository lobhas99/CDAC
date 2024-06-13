package com.sunbeam;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-26 11:52
 */

public class Demo03Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Date d1 = new Date(28, 9, 1983);
		d1.display(); // 28-9-1983
		
		Date d2 = (Date) d1.clone();
		d2.display(); // 28-9-1983
		
		d2.setMonth(2);
		d2.display(); // 28-2-1983
		d1.display(); // 28-9-1983
	}

}
