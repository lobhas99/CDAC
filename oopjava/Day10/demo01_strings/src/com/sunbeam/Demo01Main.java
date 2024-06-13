package com.sunbeam;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-31 08:40
 */

class Point {
	private int x, y;
	public Point() {
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	/*
	@Override
	public String toString() {
		return String.format("Point [x=%s, y=%s]", x, y);
	}
	*/
	/*
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Point [x=");
		builder.append(x);
		builder.append(", y=");
		builder.append(y);
		builder.append("]");
		return builder.toString();
	}
	*/
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Point [x=").append(x).append(", y=").append(y).append("]");
		return builder.toString();
	}	
}

public class Demo01Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("ABCDEFGHIJKLMNOP");
		System.out.println("Capacity: " + sb.capacity() + "  Length: " + sb.length());
		sb.append("QRSTUVWXYZ01234567");
		System.out.println("Capacity: " + sb.capacity() + "  Length: " + sb.length());
		sb.append("89");
		System.out.println("Capacity: " + sb.capacity() + "  Length: " + sb.length());
	}
}
