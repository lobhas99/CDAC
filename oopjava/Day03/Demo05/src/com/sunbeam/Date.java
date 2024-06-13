package com.sunbeam;

public class Date {
	private int day = 1; // Field Initializers - 1
	private int month;
	private int year;
	
	//Object initializers - 2
	{
		System.out.println("Object initializer");
		month = 1;
		day=2;
	}
	
	// 3
	public Date() {
		System.out.println("Inside Ctor");
		year = 2001;
		month = 2;
	}
	
	public void displayDate() {
		System.out.println("Date - "+day+"/"+month+"/"+year);
		System.out.println("Day - "+day);
		System.out.println("Month - "+month);
		System.out.println("Year - "+year);
	}
}
