package com.sunbeam;

import java.util.Scanner;

public class GraphAdjMatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Vertex count : ");
		int vCount = sc.nextInt();
		
		Graph g  = new Graph(vCount);
		
		g.accept(sc);
		//g.print();
		g.dijktras(2);
		
		sc.close();
	}

}
