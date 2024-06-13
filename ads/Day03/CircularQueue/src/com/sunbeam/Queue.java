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
		//a. reposition rear
		rear = (rear + 1) % SIZE;
		//b. add value at rear index
		arr[rear] = value;
	}
	
	public int pop() {
		// read value of front +1 index
		int value = arr[(front + 1) % SIZE];
		// reposition front
		front = (front + 1) % SIZE;
		if(front == rear)
			front = rear = -1;
		// return read value
		return value;
	}
	
	public int peek() {
		//1. read and return value of front + 1 index
		return arr[(front + 1) % SIZE];
	}
	
	public boolean isEmpty() {
		return  front == rear && rear == -1;
	}
	
	public boolean isFull() {
		return (front == -1 && rear == SIZE-1) || (front == rear && rear != -1);
	}
}




