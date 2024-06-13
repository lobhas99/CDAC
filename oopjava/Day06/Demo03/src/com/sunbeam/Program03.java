package com.sunbeam;

class Employee{
	
}
public class Program03 {

	public static void main(String[] args) {
		Date d1 = new Date(1,1,2001);
		Date d2 = new Date(1,1,2001);
		Employee e = new Employee();
		
		System.out.println("d1 - "+d1);
		System.out.println("d2 - "+d2);
		
		if(d1==d2)
			System.out.println("Reference Equal");
		else
			System.out.println("Refenrece Notequal");
		
		if(d1.equals(d2))
			System.out.println("Object Equal");
		else
			System.out.println("Object NotEqual");

	}

}
