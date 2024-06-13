package com.sunbeam;

import java.util.Scanner;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-31 09:24
 */

interface Labeled {
	String label();
}

enum Element implements Labeled {
	H(1, "Hydrogen"),
	HE(2, "Helium"), 
	LI(3, "Lithium");
	
	private final int atomNum;
	private final String atomName;
	
	private Element(int atomNum, String atomName) {
		this.atomNum = atomNum;
		this.atomName = atomName;
	}

	public int getAtomNum() {
		return atomNum;
	}
	public String getAtomName() {
		return atomName;
	}

	public String label() {
		return this.name();
	}
}

public class Demo02Main {
	public static void main(String[] args) {
		Element e1 = Element.H;
		Element e2 = Element.valueOf("H");
		System.out.println("e1 == e2 : " + (e1==e2)); // true
	
		System.out.println("Atom Num: " + e1.getAtomNum());
		System.out.println("Atom Name: " + e1.getAtomName());
		
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter atom abbr: ");
			String str = sc.next();
			Element ele = Element.valueOf(str);
			System.out.println("Atom Num: " + ele.getAtomNum());
			System.out.println("Atom Name: " + ele.getAtomName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
