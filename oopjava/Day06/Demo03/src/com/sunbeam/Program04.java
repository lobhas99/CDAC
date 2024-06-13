package com.sunbeam;

public class Program04 {

	public static void main(String[] args) {
		Date d1 = new Date(1,1,2001);
		Date d2 = new Date(1,1,2001);
		
		System.out.println("d1 - "+d1);
		System.out.println("d2 - "+d2);
		
		System.out.println("d1 hash - "+d1.hashCode());
		System.out.println("d2 hash - "+d2.hashCode());
		
		if(d1.equals(d2))
			System.out.println("Object Equal");
		else
			System.out.println("Object NotEqual");

	}

}
