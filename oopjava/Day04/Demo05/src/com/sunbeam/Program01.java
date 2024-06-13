package com.sunbeam;

// static import
//import static com.sunbeam.BankAccount.changeRoi;
//OR
import static com.sunbeam.BankAccount.*;

public class Program01 {

	public static void test() {
	System.out.println("Inside test");	
	}
	
	public static void main(String[] args) {
	//test();
	//test();
		
	BankAccount a1 = new BankAccount(1001, "c1", 10000);
	BankAccount a2 = new BankAccount(1002, "c2", 5000);
	
	a1.displayAccountDeatils();
	a2.displayAccountDeatils();
	
	//BankAccount.changeRoi();
	changeRoi();
	
	a1.displayAccountDeatils();
	a2.displayAccountDeatils();

	changeRoi();

	}

}
