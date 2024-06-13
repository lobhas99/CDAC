package com.sunbeam;

public class Date {
	final private int day = 1; // Field Initializer
	final private int month;
	final private int year;
	
	//object initializer
	{
		month = 1;
	}
	
	//Constructor
	Date(){
		year = 2001;
	}
	
	public void displayDate() {
		// day = 2; // NOT OK
		// month = 2; // NOT OK
		// year = 2002; // NOT OK
		
		System.out.println("Date - "+day+"/"+month+"/"+year);
	}
}
