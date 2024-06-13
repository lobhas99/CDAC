package com.sunbeam;

import java.util.Scanner;

public class Graph {
	private final int INF = 999;
	private int vertexCount;
	private int edgeCount;
	private int mat[][];
	public Graph(int vCount) {
		vertexCount = vCount;
		mat = new int[vertexCount][vertexCount];
		for(int i = 0 ; i < vertexCount ; i++) {
			for(int j = 0 ; j < vertexCount ; j++)
				mat[i][j] = INF;
		}
	}
	
	public void accept(Scanner sc) {
		System.out.print("Enter Edge count : ");
		edgeCount = sc.nextInt();
		System.out.println("Enter edges (src, dest, wt) : ");
		for(int i = 0 ; i < edgeCount ; i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			int wt = sc.nextInt();
			mat[src][dest] = wt;
			mat[dest][src] = wt;	// in case of directed graph this statemnt is not required
		}
	}
	
	public void print() {
		System.out.println("Graph : ");
		for(int i = 0 ; i < vertexCount ; i++) {
			for(int j = 0 ; j < vertexCount ; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println("");
		}
	}

}









