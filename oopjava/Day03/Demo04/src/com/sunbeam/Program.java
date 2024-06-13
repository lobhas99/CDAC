package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		Time t1 = new Time(); // Parameterless ctor
		t1.displayTime();
		
		Time t2 = new Time(11,11);// parameterized Ctor
		t2.displayTime();
		
	}

}
