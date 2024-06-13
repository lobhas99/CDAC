package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graph {
	private final int INF = 999;
	private int vertexCount;
	private int edgeCount;
	private List<Integer> arr[];
	public Graph(int vCount) {
		vertexCount = vCount;
		arr = new List[vertexCount];
		for(int i = 0 ; i < vertexCount ; i++)
			arr[i] = new ArrayList<Integer>();
	}
	
	public void accept(Scanner sc) {
		System.out.print("Enter Edge count : ");
		edgeCount = sc.nextInt();
		System.out.println("Enter edges (src, dest, wt) : ");
		for(int i = 0 ; i < edgeCount ; i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			arr[src].add(dest);
			arr[dest].add(src);	// in case of directed graph this statemnt is not required
		}
	}
	
	public void print() {
		System.out.println("Graph : ");
		for(int i = 0 ; i < vertexCount ; i++) {
			System.out.print(i + " -> ");
			for(int j : arr[i]) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
	}

}









