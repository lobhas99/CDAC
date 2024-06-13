package com.sunbeam;

public class Program02 {

	public static void main(String[] args) {
		Date d1 = new Date(1,1,2001);
		Date d2 = d1;
		
		System.out.println("d1 - "+d1);
		System.out.println("d2 - "+d2);
		
		if(d1==d2)
			System.out.println("Equal");
		else
			System.out.println("Notequal");

	}

}
