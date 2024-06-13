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
	
	public void addPosition(int value, int pos) {
		//1. create node with given data
		Node newnode = new Node(value);
		//2. if list is empty
		if(isEmpty())
			//a. add newnode into head
			head = newnode;
		// special case : pos <= 1
		else if(pos <= 1)
			addFirst(value);
		//3. if list is not empty
		else {
			//a. traverse till pos-1 node
			Node trav = head;
					// special case 2: pos > node count + 1
			for(int i = 1 ; i < pos-1 && trav.next != null ; i++)
				trav = trav.next;
			//b. add pos node into next of newnode
			newnode.next = trav.next;
			//c. add newnode into next of pos-1 node
			trav.next = newnode;
		}
	}
	
	public void addLast(int value) {
		//1. create node with given value
		Node newnode = new Node(value);
		//2. if list is empty
		if(isEmpty())
			//a. add newnode into head
			head = newnode;
		//3. if list is not empty
		else {
			//a. traverse till last node
			Node trav = head;
			while(trav.next != null)
				trav = trav.next;
			//b. add newnode into next of trav 
			trav.next = newnode;
		}
	}
	
	public void deleteFirst() {
		//1. if list is empty
		if(isEmpty())
			return;
		//2. if list is not empty
		//a. move head on second node
		head = head.next;
	}
	
	public void deleteLast() {
		//1. if list is empty
		if(isEmpty())
			return;
		//2. if list has single node
		else if(head.next == null)
			//a. make head equal to null
			head = null;
		//3. if list has multiple nodes
		else {
			//a. traverse till second last node
			Node trav = head;
			while(trav.next.next != null)
				trav = trav.next;
			//b. add null into next of second last node
			trav.next = null;
		}
	}
	
	public void deletePosition(int pos) {
		//1. if list is empty
		if(isEmpty())
			return;
		// special case 1: pos <= 1
		else if(pos <= 1)
			deleteFirst();
		//2. if list is not empty
		else {
			//a. traverse till pos-1 node
			Node trav = head;
					// special case 2 : pos > node count
			for(int i = 1 ; i < pos-1 && trav.next.next != null ; i++)
				trav = trav.next;
			//b. add pos+1 node into next of pos-1 node
			trav.next = trav.next.next;
		}
	}
	
	public void deleteAll() {
		// make head null
		head = null;
	}
	

}









