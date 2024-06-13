package com.sunbeam;

import java.util.Scanner;

public class Time {
	private int hours;
	private int minutes;
	
	//non static method
	public void acceptTime() //acceptTime(Time this)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter hours - ");
		this.hours = sc.nextInt();
		
		System.out.print("Enter minutes - ");
		minutes = sc.nextInt();
		
		//this.displayTime();
	}
	
	public void displayTime() {
		System.out.println("Time -"+hours+":"+this.minutes);
	}
}
