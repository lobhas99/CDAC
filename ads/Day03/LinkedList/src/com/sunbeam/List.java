package com.sunbeam;

public class List {
	static class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	public List() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addFirst(int value) {
		//1. create newnode with given value
		Node newnode = new Node(value);
		//2. check if list is empty
		if(isEmpty())
			//a. add newnode into head
			head = newnode;
		//3. if list is node empty
		else {
			//a. add first node into next of newnode
			newnode.next = head;
			//b. add newnode into head
			head = newnode;
		}
	}
	
	public void display() {
		//1. create trav referance and start at head
		Node trav = head;
		System.out.print("List : ");
		while(trav != null) {
			//2. print(visit) current node
			System.out.print(" " + trav.data);
			//3. go on next node
			trav = trav.next;
		}//4. repeat step 2 and 3 till last node
	}
	

}









