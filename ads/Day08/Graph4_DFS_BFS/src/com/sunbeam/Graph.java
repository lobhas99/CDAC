package com.sunbeam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Graph {
	private int vertexCount;
	private int edgeCount;
	private boolean mat[][];
	public Graph(int vCount) {
		vertexCount = vCount;
		mat = new boolean[vertexCount][vertexCount];
	}
	
	public void accept(Scanner sc) {
		System.out.print("Enter Edge count : ");
		edgeCount = sc.nextInt();
		System.out.println("Enter edges (src, dest) : ");
		for(int i = 0 ; i < edgeCount ; i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			mat[src][dest] = true;
			mat[dest][src] = true;	// in case of directed graph this statemnt is not required
		}
	}
	
	public void print() {
		System.out.println("Graph : ");
		for(int i = 0 ; i < vertexCount ; i++) {
			for(int j = 0 ; j < vertexCount ; j++) {
				System.out.print(mat[i][j] ? 1 + " " : 0 + " ");
			}
			System.out.println("");
		}
	}
	
	public void DFSTraversal(int start) {
		// create stack to push vertices
		Stack<Integer> st = new Stack<Integer>();
		// create array to mark vertices
		boolean marked[] = new boolean[vertexCount];
		//1. Choose a vertex as start vertex. - start
		//2. Push start vertex on stack & mark it. 
		st.push(start);
		marked[start] = true;
		System.out.print("DFS Treversal : ");
		while(!st.isEmpty()) {
			//3. Pop vertex from stack.
			int u = st.pop();
			//4. Print the vertex.
			System.out.print(" " + u);
			//5. Put all non-visited neighbours of the vertex on the stack and mark them.
			for(int v = 0 ; v < vertexCount ; v++) {
				if(mat[u][v] && !marked[v]) {
					st.push(v);
					marked[v] = true;
				}
			}
		}//6. Repeat 3-5 until stack is empty.
		System.out.println("");
	}

	public void BFSTraversal(int start) {
		// create queue to push vertices
		Queue<Integer> q = new LinkedList<Integer>();
		// create array to mark vertices
		boolean marked[] = new boolean[vertexCount];
		//1. Choose a vertex as start vertex. - start 
		//2. Push start vertex on queue & mark it 
		q.offer(start);
		marked[start] = true;
		System.out.print("BFS Trversal : ");
		while(!q.isEmpty()) {
			//3. Pop vertex from queue. 
			int u = q.poll();
			//4. Print the vertex.
			System.out.print(" " + u);
			//5. Put all non-visited neighbours of the vertex on the queue and mark them.
			for(int v = 0 ; v < vertexCount ; v++) {
				if(mat[u][v] && !marked[v]) {
					q.offer(v);
					marked[v] = true;
				}
			}
		}//6. Repeat 3-5 until queue is empty.
		System.out.println("");
	}
	
	public void singleSourcePathLength(int start) {
		// create queue to push vertices
		Queue<Integer> q = new LinkedList<Integer>();
		// create array to mark vertices
		boolean marked[] = new boolean[vertexCount];
		// create array to keep track of lengths
		int length[] = new int[vertexCount];
		//1. Choose a vertex as start vertex. - start 
		//2. Push start vertex on queue & mark it, also make length = 0
		q.offer(start);
		marked[start] = true;
		length[start] = 0;
		while(!q.isEmpty()) {
			//3. Pop vertex from queue. 
			int u = q.poll();
			//5. Put all non-visited neighbours of the vertex on the queue and mark them.
			for(int v = 0 ; v < vertexCount ; v++) {
				if(mat[u][v] && !marked[v]) {
					q.offer(v);
					marked[v] = true;
					length[v] = length[u] + 1;
				}
			}
		}//6. Repeat 3-5 until queue is empty.
		
		System.out.println("Length of all vertices from " + start);
		for(int i = 0 ; i < vertexCount ; i++)
			System.out.println(start + "->" + i + " = " + length[i]);
	}
	
	public void DFSSpanningTree(int start) {
		// create stack to push vertices
		Stack<Integer> st = new Stack<Integer>();
		// create array to mark vertices
		boolean marked[] = new boolean[vertexCount];
		//1. Choose a vertex as start vertex. - start
		//2. Push start vertex on stack & mark it. 
		st.push(start);
		marked[start] = true;
		System.out.print("DFS Spanning Tree : ");
		while(!st.isEmpty()) {
			//3. Pop vertex from stack.
			int u = st.pop();
			//5. Put all non-visited neighbours of the vertex on the stack and mark them.
			for(int v = 0 ; v < vertexCount ; v++) {
				if(mat[u][v] && !marked[v]) {
					st.push(v);
					marked[v] = true;
					System.out.print("(" + u + "-" + v + ")");
				}
			}
		}//6. Repeat 3-5 until stack is empty.
		System.out.println("");
	}
	
	public void BFSSpanningTree(int start) {
		// create queue to push vertices
		Queue<Integer> q = new LinkedList<Integer>();
		// create array to mark vertices
		boolean marked[] = new boolean[vertexCount];
		//1. Choose a vertex as start vertex. - start 
		//2. Push start vertex on queue & mark it 
		q.offer(start);
		marked[start] = true;
		System.out.print("BFS Spanning Tree : ");
		while(!q.isEmpty()) {
			//3. Pop vertex from queue. 
			int u = q.poll();
			//5. Put all non-visited neighbours of the vertex on the queue and mark them.
			for(int v = 0 ; v < vertexCount ; v++) {
				if(mat[u][v] && !marked[v]) {
					q.offer(v);
					marked[v] = true;
					System.out.print("(" + u + "-" + v + ")");
				}
			}
		}//6. Repeat 3-5 until queue is empty.
		System.out.println("");
	}
	
}



























