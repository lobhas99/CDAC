package com.sunbeam;

public class Date {
	private int day;
	private int month;
	private int year;
	
	// Constructors
	Date(){
		day=1;
		month = 1;
		year = 2001;
	}
	
	//Setters
	public void setDay(int day) {
		this.day = day;
	}
	
	//Getters
	public int getDay() {
		return this.day;
	}
	
	
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}


	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// facilitators
	public void displayDate() {
		System.out.println("Date - "+day+"/"+month+"/"+year);
		System.out.println("Day - "+day);
		System.out.println("Month - "+month);
		System.out.println("Year - "+year);
	}
}
