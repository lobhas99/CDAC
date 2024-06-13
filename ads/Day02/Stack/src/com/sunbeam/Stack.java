package com.sunbeam;

public class Stack {
	private int arr[];
	private int top;
	private final int SIZE;
	public Stack(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = -1;
	}
	
	public void push(int value) {
		//a. reposition top
		top++;
		//b. add value at top index
		arr[top] = value;
	}
	
	public void pop() {
		//a. reposition top
		top--;
	}
	
	public int peek() {
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












