package com.sunbeam;

public class Stack {
	private char arr[];
	private int top;
	private final int SIZE;
	public Stack(int size) {
		SIZE = size;
		arr = new char[SIZE];
		top = -1;
	}
	
	public void push(char value) {
		//a. reposition top
		top++;
		//b. add value at top index
		arr[top] = value;
	}
	
	public char pop() {
		//a. reposition top
		return arr[top--];
	}
	
	public char peek() {
		//a. read/return value of top index
		return arr[top];
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == SIZE-1;
	}

}












