package com.sunbeam;

public class Queue {
	private int arr[];
	private int rear, front;
	private final int SIZE;
	public Queue(int size) {
		SIZE = size;
		arr = new int[SIZE];
		front = rear = -1;
	}
	
	public void push(int value) {
		//1. reposition rear
		rear++;
		//2. add value at rear index
		arr[rear] = value;
	}
	
	public int pop() {
		//1. read and return data of front+1 index
		int value = arr[front + 1];
		//increment front
		front++;
		return value;		
	}
	
	public int peek() {
		// read and return data of front + 1 index
		return arr[front + 1];
	}
	
	public boolean isEmpty() {
		return front == rear;
	}
	
	public boolean isFull() {
		return rear == SIZE-1;
	}

}

















