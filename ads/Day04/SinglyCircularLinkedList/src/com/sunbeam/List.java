package com.sunbeam;

public class List {
	static class Node{
		private char data;
		private Node next;
		public Node(char ch) {
			data = ch;
			next = null;
		}
	}
	
	private Node head;
	private int count;
	public List() {
		head = null;
		count = 0;
	}
	
	public boolean isEmpty() {
		return head == null;
		//return count == 0;
	}
	
	public void display() {
		if(isEmpty())
			return;
		//1. start at head
		Node trav = head;
		System.out.println("Number of Nodes : " + count);
		System.out.print("List : ");
		do {
			//2. print current node
			System.out.print(" " + trav.data);
			//3. go on next node
			trav = trav.next;
		}while(trav != head);	//4. repeat step 2 and 3 till last node
	}
	
	public void addFirst(char ch) {
		//1. create node with given data
		Node newnode = new Node(ch);
		//2. if list is empty
		if(isEmpty()) {
			//a. add newnode into head
			head = newnode;
			//b. make list circular
			newnode.next = head;
		}
		//3. if list is not empty
		else {
			//a. add first node into next of newnode
			newnode.next = head;
			// traverse till last node
			Node trav = head;
			while(trav.next != head)
				trav = trav.next;
			//b. add newnode into next of last node
			trav.next = newnode;
			//c. move head on newnode
			head = newnode;
		}
		// increament count
		count++;
	}

	public void addLast(char ch) {
		//1. create node
		Node newnode = new Node(ch);
		//2. if list is empty
		if(isEmpty()) {
			//a. add newnode into head
			head = newnode;
			//b. make list circular
			newnode.next = head;
		}
		//3. if list is not empty
		else {
			//a. first node into next of newnode
			newnode.next = head;
			//b. traverse till last node
			Node trav = head;
			while(trav.next != head)
				trav = trav.next;
			
			//for( ; trav.next != head ; trav = trav.next);
			
			//c. add newnode into next of last node
			trav.next = newnode;
		}
		// increment count
		count++;
	}
	
	public void addPosition(char ch, int pos) {
		// valid positions : 1 >= pos <= count + 1
		if(pos < 1 || pos > count + 1)
			return;
		//1. create node
		Node newnode = new Node(ch);
		//2. if list is empty
		if(isEmpty()) {
			//a. add newnode into head
			head = newnode;
			//b. make it circular
			newnode.next = head;
		}
		else if(pos == 1) {
			addFirst(ch);
			return;
		}
		//3. if list is not empty
		else {
			//a. traverse till pos-1 node
			Node trav = head;
			for(int i = 1 ; i < pos - 1 ; i++, trav = trav.next);
			//b. add pos node into next of newnode
			newnode.next = trav.next;
			//c. add newnode into next of pos-1 node
			trav.next = newnode;
		}
		// increament count
		count++;
	}
	
	public void deleteFirst() {
		//1. if list is empty
		if(isEmpty())
			return;
		//2. if list has single node
		else if(head.next == head)
			// add null into head
			head = null;
		//3. if list has multiple nodes
		else {
			//a. traverse till last node
			Node trav = head;
			while(trav.next != head)
				trav = trav.next;
			//b. move head on second node
			head = head.next;
			//c. add second node into next of last node
			trav.next = head;
		}
		// decrement count
		count--;
	}
	
	public void deleteLast() {
		//1. if list is empty
		if(isEmpty())
			return;
		//2. if list has single node
		else if(head.next == head)
			// add null into head
			head = null;
		//3. if list has multiple nodes
		else {
			//a. traverse till second last node
			Node trav = head;
			while(trav.next.next != head)
				trav = trav.next;
			//b. add head into next of second last node
			trav.next = head;
		}
		// decrement count
		count--;
	}
	
	public void deletePosition(int pos) {
		// valid positions : 1 >= pos <= count
		if(pos < 1 || pos > count)
			return;
		//1. if list is empty
		if(isEmpty())
			return;
		//2. if list has single node
		else if(head.next == head)
			// add null into head
			head = null;
		else if(pos == 1) {
			deleteFirst();
			return;
		}
		//3. if list has multiple nodes
		else {
			//a. traverse till pos-1 node
			Node trav = head;
			for(int i = 1 ; i < pos-1 ; i++)
				trav = trav.next;
			//b. add pos+1 node into next of pos-1 node
			trav.next = trav.next.next;
		}
		// decrement count
		count--;
	}
}




























