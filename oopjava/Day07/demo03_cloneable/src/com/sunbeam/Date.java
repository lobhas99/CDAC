package com.sunbeam;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-26 11:52
 */

public class Date implements Cloneable {
	private int day, month, year;
	public Date() {
	}
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
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
	public void display() {
		System.out.printf("Date: %d-%d-%d\n", this.day, this.month, this.year);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Object temp = super.clone();
		return temp;
	}
}













