package com.sunbeam;

class Time{
	private int hours;
	private int minutes;
	
	public Time(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}
	
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public int getHours() {
		return hours;
	}
	
	public void displayTime() {
		System.out.println("Time - "+hours + " : "+minutes);
	}
	
}

public class Program03 {
	
	
	public static void addTime(Time t, int hours) {
		t.setHours(t.getHours() + hours);
		
		// when fields are default can be accessed on object within the same package
		//t.hours = t.hours + hours; 
	}
	
	public static void main(String[] args) {
		Time t1 = new Time(10, 30);
		t1.displayTime();
		addTime(t1,2);
		t1.displayTime();
	}

}
