package com.sunbeam;

import java.util.Scanner;

public class BankAccount {
	private int accno;
	private String name;
	private double balance;
	
	//private static double roi = 5; // static field initializer
	private static double roi;
	
	// static block
	static {
		roi = 6;
	}
	
	public BankAccount(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	} 
	
	public static void changeRoi() {
		System.out.print("Enter the new roi -  ");
		roi = new Scanner(System.in).nextDouble();
	}
	
	public Number displayAccountDeatils() {
		System.out.println("Accno - "+accno);
		System.out.println("Name - "+name);
		System.out.println("Balance - "+balance);
		System.out.println("roi - "+this.roi);
		return 10;
	}
	
}
