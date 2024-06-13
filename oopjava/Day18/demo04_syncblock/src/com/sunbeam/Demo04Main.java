package com.sunbeam;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-09 11:16
 */

class Account {
	private int id;
	private String type;
	private double balance;
	public Account() {
	}
	public Account(int id, String type, double balance) {
		this.id = id;
		this.type = type;
		this.balance = balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", type=" + type + ", balance=" + balance + "]";
	}
	public void deposit(double amount) {
		double newBalance = balance + amount;
		balance = newBalance;
	}
	public void withdraw(double amount) {
		double newBalance = balance - amount;
		balance = newBalance;
	}
}

public class Demo04Main {
	public static void delay(int milli) {
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// synchronized block
	public static void main(String[] args) throws Exception {
		Account acc = new Account(101, "Saving", 10000);
		
		class DepositThread extends Thread {
			@Override
			public void run() {
				for(int i=1; i<=10; i++) {
					synchronized (acc) 
					{ // lock acc
						acc.deposit(1000);
						System.out.println("After deposit Balance: " + acc.getBalance());						
					} // unlock acc
					delay(300);
				}
			}
		}
		DepositThread dt = new DepositThread();
		
		class WithdrawThread extends Thread {
			@Override
			public void run() {
				for(int i=1; i<=10; i++) {
					synchronized (acc) 
					{ // lock acc
						acc.withdraw(1000);
						System.out.println("After withdraw Balance: " + acc.getBalance());						
					} // unlock acc
					delay(300);
				}
			}
		}
		WithdrawThread wt = new WithdrawThread();
		
		dt.start();
		wt.start();
		
		dt.join();
		wt.join();
		
		System.out.println("Final Balance: " + acc.getBalance());
	}
}
















