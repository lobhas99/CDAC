package com.sunbeam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BSTree {
	static class Node{
		private int data;
		private Node left;
		private Node right;
		public Node(int value) {
			data = value;
			left = null;
			right = null;
		}
		public int getData() {
			return data;
		}
	}
	
	private Node root;
	public BSTree() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}

	public void addNode(int value) {
		//1. create node with given data
		Node newnode = new Node(value);
		//2. if tree is empty
		if(isEmpty())
			//a. add newnode into root
			root = newnode;
		//3. if tree is not empty
		else {
			//3.1 create trave and start at root
			Node trav = root;
			while(true) {
				//3.2 if value is less than current node data
				if(value  < trav.data) {
					//3.2.1 if left is empty
					if(trav.left == null) {
						// add newnode into left of current node
						trav.left = newnode;
						break;
					}
					//3.2.2 if left is not empty
					else
						// go into left
						trav = trav.left;
				}
				//3.3 if value is greater than current node data
				else {
					//3.2.1 if right is empty
					if(trav.right == null) {
						// add newnode into right of current node
						trav.right = newnode;
						break;
					}
					//3.2.2 if right is not empty
					else
						// go into right
						trav = trav.right;
				}
			}//3.4 repeat step 3.2 and 3.3 till node is not added into tree
		}
	}
	
	public void preorder(Node trav) {
		if(trav == null)
			return;
		System.out.print(" " + trav.data);//V 
		preorder(trav.left);//L 
		preorder(trav.right);//R
	}
	
	public void preorder() {
		System.out.print("Preorder: ");
		preorder(root);
		System.out.println("");
	}
	
	public void inorder(Node trav) {
		if(trav == null)
			return;
		inorder(trav.left);//L 
		System.out.print(" " + trav.data);//V 
		inorder(trav.right);//R
	}
	
	public void inorder() {
		System.out.print("Inorder: ");
		inorder(root);
		System.out.println("");
	}
	
	public void postorder(Node trav) {
		if(trav == null)
			return;
		postorder(trav.left);//L 
		postorder(trav.right);//R
		System.out.print(" " + trav.data);//V
	}
	
	public void postorder() {
		System.out.print("Postorder: ");
		postorder(root);
		System.out.println("");
	}
	
	public Node binarySearch(int key) {
		//1. start from root
		Node trav = root;
		while(trav != null) {
			//2. if key is equal to current data
			if(key == trav.data)
				//return current node
				return trav;
			//3. if key is less than current data
			else if(key < trav.data)
				// search key into left of current node
				trav = trav.left;
			//4. if key is greater than current data
			else
				// search key into right of current node
				trav = trav.right;
		}//5. repeat step 2 to 4 till leaf nodes 
		//6. key is not found
		return null;
	}
	
	public void DFSTraversal() {
		//0. create stack to push nodes of tree
		Stack<Node> st = new Stack<>();
		//1. push root on stack
		st.push(root);
		System.out.print("DFS Traversal : ");
		while(!st.isEmpty()) {
			//2. pop one node from stack
			Node trav = st.pop();
			//3. visit(print) node
			System.out.print(" " + trav.data);
			//4. if right exist, push it on stack
			if(trav.right != null)
				st.push(trav.right);
			//5. if left exist, push it on stack
			if(trav.left != null)
				st.push(trav.left);
		}//6. while stack is not empty repeat ste 2 to 5
		System.out.println("");
	}
	
	public void BFSTraversal() {
		//0. create queue to push nodes of tree
		Queue<Node> q = new LinkedList<BSTree.Node>();
		//1. push root on queue
		q.offer(root);
		System.out.print("BFS Traversal : ");
		while(!q.isEmpty()) {
			//2. pop one node from queue
			Node trav = q.poll();
			//3. visit(print) node
			System.out.print(" " + trav.data);
			//4. if left exist, push it on queue
			if(trav.left != null)
				q.offer(trav.left);
			//5. if right exist, push it on queue
			if(trav.right != null)
				q.offer(trav.right);
		}//6. while queue is not empty repeat ste 2 to 5
		System.out.println("");
	}
	
	
	public Node[] binarySearchWithParent(int key) {
		//1. start from root
		Node trav = root;
		Node parent = null;
		while(trav != null) {
			//2. if key is equal to current data
			if(key == trav.data)
				//return current node
				break;
			parent = trav;
			//3. if key is less than current data
			if(key < trav.data)
				// search key into left of current node
				trav = trav.left;
			//4. if key is greater than current data
			else
				// search key into right of current node
				trav = trav.right;
		}//5. repeat step 2 to 4 till leaf nodes 
		if(trav == null)
			parent = null;
		return new Node[]{trav, parent};
	}
	
	public void deleteNode(int key) {
		//1. search node with its parent to be deleted
		Node arr[] = binarySearchWithParent(key);
		Node temp = arr[0], parent = arr[1];
		
		//2. if key is not found
		if(temp == null)
			return;
		
		//3. check if node has 2 childs
		if(temp.left != null && temp.right != null){
			//1. find predecessor with its parent
			Node pred = temp.left;
			parent = temp;
			while(pred.right != null){
				parent = pred;
				pred = pred.right;	
			}
			//2. replace data of temp by data of pred
			temp.data = pred.data;
			//3. mark pred for deletion
			temp = pred;
		}
		//4. check if node has right child (1 child)
		if(temp.left == null){
			if(temp == root)		// root node
				root = temp.right;
			else if(temp == parent.left)		// parent's left child
				parent.left = temp.right;
			else	// if(temp == parent.right)	// parent's right child
				parent.right = temp.right;
		}
		//5. check if node has left child (1 child)
		else { //if(temp.right == null)
			if(temp == root)			// root node
				root = temp.left;
			else if(temp == parent.left)		// parent's left child
				parent.left = temp.left;
			else	// if(temp == parent.right)	// parent's right child
				parent.right = temp.left;
		}
	}
	
	public int height(Node trav) {
		//0. if left or right sub tree is absent 
		if(trav == null)
				return -1;		//then return -1
		//1. find height of left subtree
		int hl = height(trav.left);
		//2. find height of right subtree
		int hr = height(trav.right);
		//3. find max height
		int max = Integer.max(hl, hr);
		//4. add one into max height(return)
		return max + 1;
	}
	
	public int height() {
		return height(root);
	}
	
	
}




























