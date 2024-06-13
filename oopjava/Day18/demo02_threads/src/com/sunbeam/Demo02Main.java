package com.sunbeam;

import java.util.Scanner;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-09 09:15
 */

/*
public class Demo02Main {
	public static void delay(int milli) {
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void method1() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Method1 : " + i);
			delay(1000);
		}
	}
	
	public static void method2() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Method2 : " + i);
			delay(1000);
		}
	}

	public static void main(String[] args) {
		// Way 1: Thread creation -- "extends Thread"
		class MyThread extends Thread {
			@Override
			public void run() {
				method1(); // the code to be executed by the thread				
			}
		}
		MyThread th1 = new MyThread();
		th1.start();
		
		// Way 2: Thread creation -- "implements Runnable"
		class MyRunnable implements Runnable {
			@Override
			public void run() {
				method2(); // the code to be executed by the thread
			}
		}
		MyRunnable mr = new MyRunnable();
		Thread th2 = new Thread(mr);
		th2.start();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Main : " + i);
			delay(1000);
		}
	}
}
*/

/*
// Thread Id and Name
public class Demo02Main {
	public static void delay(int milli) {
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// Way 1: Thread creation -- "extends Thread"
		class MyThread extends Thread {
			@Override
			public void run() {
				Thread curTh = Thread.currentThread();
				for (int i = 1; i <= 10; i++) {
					System.out.println(curTh.getId() + " -- " + curTh.getName() + " : " + i);
					delay(1000);
				}
			}
		}
		MyThread th1 = new MyThread();
		th1.setName("Sunbeam");
		th1.start();
		
		// Way 2: Thread creation -- "implements Runnable"
		class MyRunnable implements Runnable {
			@Override
			public void run() {
				Thread curTh = Thread.currentThread();
				for (int i = 1; i <= 10; i++) {
					System.out.println(curTh.getId() + " -- " + curTh.getName() + " : " + i);
					delay(1000);
				}
			}
		}
		MyRunnable mr = new MyRunnable();
		Thread th2 = new Thread(mr);
		th2.setName("DAC");
		th2.start();
		
		Thread curTh = Thread.currentThread();
		for (int i = 1; i <= 10; i++) {
			System.out.println(curTh.getId() + " -- " + curTh.getName() + " : " + i);
			delay(1000);
		}
	}
}
*/

/*
//Thread Join
public class Demo02Main {
	public static void delay(int milli) {
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		// Way 1: Thread creation -- "extends Thread"
		class MyThread extends Thread {
			@Override
			public void run() {
				for (int i = 1; i <= 8; i++) {
					System.out.println("Thread1 : " + i);
					delay(1000);
				}
			}
		}
		MyThread th1 = new MyThread();
		th1.start();
		
		// Way 2: Thread creation -- "implements Runnable"
		class MyRunnable implements Runnable {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("Thread2 : " + i);
					delay(1000);
				}
			}
		}
		MyRunnable mr = new MyRunnable();
		Thread th2 = new Thread(mr);
		th2.start();

		for (int i = 1; i <= 3; i++) {
			System.out.println("Main : " + i);
			delay(1000);
		}
		
		// block current thread for given thread
		th1.join();
		th2.join();
		
		System.out.println("Bye!");
	}
}
*/

/*
// Multiple threads from One thread class
public class Demo02Main {
	public static void delay(int milli) {
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		class TableThread extends Thread {
			private int num;
			public TableThread(int num) {
				this.num = num;
			}
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println(num + " * " + i + " = " + (num * i));
					delay(1000);
				}
			}
		}
		
		TableThread th1 = new TableThread(5);
		th1.start();
		TableThread th2 = new TableThread(7);
		th2.start();
		TableThread th3 = new TableThread(9);
		th3.start();
	}
}
*/

/*
// Daemon thread/Backgroud thread
public class Demo02Main {
	public static void delay(int milli) {
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		class MyThread1 extends Thread {
			@Override
			public void run() {
				for (int i = 1; i <= 6; i++) {
					System.out.println("Thread1 : " + i);
					delay(1000);
				}
			}
		}
		MyThread1 th1 = new MyThread1();
		th1.start();

		class MyThread2 extends Thread {
			@Override
			public void run() {
				for (int i = 1; i <= 13; i++) {
					System.out.println("Thread2 : " + i);
					delay(1000);
				}
			}
		}
		MyThread2 th2 = new MyThread2();
		th2.setDaemon(true);
		th2.start();
		// Daemon threads are Background threads that provide services to the
		// Non-daemon (Foreground) threads.
		// Daemon threads are auto terminated when all non-daemon threads exit.

		for (int i = 1; i <= 3; i++) {
			System.out.println("Main : " + i);
			delay(1000);
		}
	}
}
*/

/*
// Thread priorities
public class Demo02Main {
	public static void delay(int milli) {
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		class MyThread1 extends Thread {
			@Override
			public void run() {
				Thread curTh = Thread.currentThread();
				System.out.println("Thread1 Priority: " + curTh.getPriority());
				for (int i = 1; i <= 6; i++) {
					System.out.println("Thread1 : " + i);
					delay(1000);
				}
			}
		}
		MyThread1 th1 = new MyThread1();
		th1.setPriority(7);
		th1.start();

		for (int i = 1; i <= 6; i++) {
			System.out.println("Main : " + i);
			delay(1000);
		}
		Thread curTh = Thread.currentThread();
		System.out.println("Main Priority: " + curTh.getPriority());
	}
}
*/

/*
//Thread states
public class Demo02Main {
	public static void delay(int milli) {
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws Exception {
		class MyThread1 extends Thread {
			@Override
			public void run() {
				Thread curTh = Thread.currentThread();
				System.out.println("Running Thread State: " + curTh.getState());
				for (int i = 1; i <= 6; i++) {
					System.out.println("Thread1 : " + i);
					delay(1000);
				}
			}
		}
		MyThread1 th1 = new MyThread1();
		System.out.println("Before Start Thread State: " + th1.getState());
		th1.start();

		delay(500);
		System.out.println("In main -- Thread State: " + th1.getState());
		
		th1.join();
		System.out.println("After Terminate Thread State: " + th1.getState());
	}
}
*/


//Thread interrupt
public class Demo02Main {
	public static void main(String[] args) throws Exception {
		class MyThread1 extends Thread {
			@Override
			public void run() {
				try {
					for (int i = 1; i <= 10; i++) {
						System.out.println("Thread1 : " + i);
						Thread.sleep(10000);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
			
		MyThread1 th1 = new MyThread1();
		th1.start();

		Scanner sc = new Scanner(System.in);
		System.out.println("Press enter to interrupt the thread...");
		sc.nextLine();
		th1.interrupt();
		
		System.out.println("Bye!");
	}
}





