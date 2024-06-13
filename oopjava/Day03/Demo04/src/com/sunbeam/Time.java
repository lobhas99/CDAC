package com.sunbeam;

public class Time {
	private int hours;
	private int minutes;

	public Time() {
		this(10, 10);
		
	}

	public Time(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}

	public void displayTime() {
		System.out.println("Time -" + hours + ":" + this.minutes);
	}

}
