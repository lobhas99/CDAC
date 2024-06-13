package com.sunbeam;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-27 12:41
 */

class InvalidTimeException extends RuntimeException {
	private String field; // seconds, minutes, hours
	private int value; // wrong value
	public InvalidTimeException() {
		super("Invalid time");
	}
	public InvalidTimeException(String field, int value) {
		super("Invalid " + field + ": " + value);
		this.field = field;
		this.value = value;
	}
	public String getField() {
		return field;
	}
	public int getValue() {
		return value;
	}
	// ...
}

class Time {
	private int hr, min, sec;
	public Time() {
	}
	public Time(int hr, int min, int sec) {
		this.hr = hr;
		this.min = min;
		this.sec = sec;
	}
	public int getHr() {
		return hr;
	}
	public void setHr(int hr) {
		this.hr = hr;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		if(min <= 0 || min >= 60)
			throw new InvalidTimeException("minutes", min);
		this.min = min;
	}
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		if(sec <= 0 || sec >= 60)
			throw new InvalidTimeException();
		this.sec = sec;
	}
	@Override
	public String toString() {
		return "Time [hr=" + hr + ", min=" + min + ", sec=" + sec + "]";
	}
}

public class Demo05Main {
	public static void main(String[] args) {
		try {
			Time t1 = new Time();
			t1.setHr(12);
			t1.setMin(82);
			t1.setSec(64);
			System.out.println(t1.toString());
		} catch (InvalidTimeException e) {
			System.out.println(e.getMessage());
			System.out.println("Wrong value: " + e.getValue());
			e.printStackTrace();
		}
	}
}















