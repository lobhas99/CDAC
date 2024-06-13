package com.sunbeam;

public class Time {
	private int hours;
	private int minutes;

	{
		System.out.println("Object initializer-1");
		hours = 10;
	}
	
	{
		System.out.println("Object initializer-2");
		minutes = 11;
	}

	public void displayTime() {
		System.out.println("Time -" + hours + ":" + this.minutes);
	}

}
