package com.sunbeam;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//final int num = 10; // OK
		final int num; // OK
		
		System.out.println("Hello");
		
		num = 10; // OK
		//num = 20; // NOT OK
		
		//final Date d1 = new Date(); // OK
		final Date d1;
		d1 = new Date(); // OK
		//d1 = new Date(); // NOT OK
	}

}
