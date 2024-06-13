package com.sunbeam;

import java.util.Scanner;

public class Graph {
	private static final int INF = 999;
	static class Table{
		private int dist[];
		private int parent[];
		private boolean spt[];
		public Table(int vCount){
			dist = new int[vCount];
			parent = new int[vCount];
			spt = new boolean[vCount];
			for(int i = 0 ; i < vCount ; i++) {
				dist[i] = INF;
				parent[i] = -1;
				spt[i] = false;
			}
		}
		public int getMinDistVert(int vCount) {
			int minKey = INF, minKeyVertex = -1;
			for(int i = 0 ; i < vCount ; i++) {
				if(!spt[i] && dist[i] < minKey) {
					minKey = dist[i];
					minKeyVertex = i;
				}
			}
			return minKeyVertex;
		}
		
		public void printDist(int start, int vCount) {
			for(int v = 0 ; v < vCount ; v++)
				System.out.println("Dist[" + start + "][" + v + "] = " + dist[v]);
		}
	
	}
	private int vertexCount, edgeCount;
	private int adjmat[][];
	public Graph(int vCount) {
		vertexCount = vCount;
		adjmat = new int[vertexCount][vertexCount];
		for(int i = 0 ; i < vertexCount ; i++) {
			for(int j = 0 ; j < vertexCount ; j++) {
				adjmat[i][j] = INF;
			}
		}
	}
	
	public void accept(Scanner sc) {
		System.out.print("Enter Edge count : ");
		edgeCount = sc.nextInt();
		System.out.print("Enter edges(src, dest) : ");
		for(int i = 0 ; i < edgeCount ; i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			int wt = sc.nextInt();
			adjmat[src][dest] = wt;
			//adjmat[dest][src] = wt;	// in case of directed graph it is not required
		}
	}
	
	public void print() {
		System.out.println("Graph : ");
		for(int i = 0 ; i < vertexCount ; i++) {
			for(int j = 0 ; j < vertexCount ; j++) {
				System.out.print(adjmat[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	public void dijktras(int start) {
		// create 3 arrays to keep track of parent, keys and mst
		Table tbl = new Table(vertexCount);
		// make key of start vertex = 0
		tbl.dist[start] = 0;
		
		int vCount = 0;
		while(vCount < vertexCount) {
			// select min key vertex
			int u = tbl.getMinDistVert(vertexCount);
			// mark vertex as added into mst
			tbl.spt[u] = true;
			vCount++;
			
			for(int v = 0 ; v < vertexCount ; v++) {
				if(adjmat[u][v] != INF && !tbl.spt[v] && tbl.dist[u] + adjmat[u][v] < tbl.dist[v]) {
					tbl.dist[v] = tbl.dist[u] + adjmat[u][v];
					tbl.parent[v] = u;
				}
			}
		}
		tbl.printDist(start, vertexCount);		
	}
	

}







