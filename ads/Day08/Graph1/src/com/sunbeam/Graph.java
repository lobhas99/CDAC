package com.sunbeam;

import java.util.Scanner;

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

}









