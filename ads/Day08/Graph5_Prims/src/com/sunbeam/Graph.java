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
	
	public int findMinKeyVertex(int keys[], boolean mst[]) {
		int minKey = INF, minKeyVertex = -1;
		for(int i = 0 ; i < vertexCount ; i++) {
			if(!mst[i] && keys[i] < minKey) {
				minKey = keys[i];
				minKeyVertex = i;
			}
		}
		return minKeyVertex;
	}
	
	public void primsMST(int start) {
		// create arrays to maintain keys, parents, mst
		int keys[] = new int[vertexCount];
		int parents[] = new int[vertexCount];
		boolean mst[] = new boolean[vertexCount];
		for(int i = 0 ; i < vertexCount ; i++) {
			keys[i] = INF;
			parents[i] = -1;
			mst[i] = false;
		}
		
		//1 make key of start vertex zero
		keys[start] = 0;
		int count = 0;
		while(count < vertexCount) {
			//2. select minimum key vertex
			int u = findMinKeyVertex(keys, mst);
			//3. add min key vertex into mst
			mst[u] = true;
			//4. increment count
			count++;
			//5. update keys of all adjcent vertices
			for(int v = 0 ; v < vertexCount ; v++) {
				if(mat[u][v] != INF && !mst[v] && mat[u][v] < keys[v]) {
					keys[v] = mat[u][v];
					parents[v] = u;
				}
			}
		}
		// print MST and find minimum weight
		int wt = 0;
		for(int i = 0 ; i < vertexCount ; i++) {
			System.out.print("(" + parents[i] + " -> " + i + ")");
			wt += keys[i];
		}
		System.out.println("\n Minimum weight : " + wt);
		
	}
	
	

}























