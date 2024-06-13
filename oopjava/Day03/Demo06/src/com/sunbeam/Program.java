package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		Date d1 = new Date();
		//d1.day=2;
		d1.displayDate();
		d1.setDay(2);
		//System.out.println("Update Day value - "+ d1.day);
		System.out.println("Update Day value - "+ d1.getDay());
	}

}
