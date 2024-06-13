package com.sunbeam;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-09 11:57
 */

/*
// two threads executing concurrently
public class Demo06Main {
	public static void delay(int milli) {
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		class SunbeamThread extends Thread {
			@Override
			public void run() {
				String str = "SUNBEAM\n";
				for (int i = 0; i < str.length(); i++) {
					System.out.print(str.charAt(i));
					delay(300);
				}
				// ...
			}
		}
		SunbeamThread st = new SunbeamThread();
		
		class InfotechThread extends Thread {
			@Override
			public void run() {
				String str = "INFOTECH\n";
				for (int i = 0; i < str.length(); i++) {
					System.out.print(str.charAt(i));
					delay(300);
				}
				// ...
			}
		}
		InfotechThread it = new InfotechThread();
		
		it.start();
		st.start();
	}
}
*/

/*
//only one thread execute at a time
public class Demo06Main {
	public static void delay(int milli) {
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Object lock = new Object();
		
		class SunbeamThread extends Thread {
			@Override
			public void run() {
				String str = "SUNBEAM\n";
				synchronized(lock) {
					for (int i = 0; i < str.length(); i++) {
						System.out.print(str.charAt(i));
						delay(300);
					}
				}
				// ...
			}
		}
		SunbeamThread st = new SunbeamThread();
		
		class InfotechThread extends Thread {
			@Override
			public void run() {
				String str = "INFOTECH\n";
				synchronized(lock) {
					for (int i = 0; i < str.length(); i++) {
						System.out.print(str.charAt(i));
						delay(300);
					}
				}
				// ...
			}
		}
		InfotechThread it = new InfotechThread();
		
		it.start();
		st.start();
	}
}
*/

//SUNBEAM should execute before INFOTECH.
public class Demo06Main {
	public static void delay(int milli) {
		try {
			Thread.sleep(milli);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Object obj = new Object();
		
		class SunbeamThread extends Thread {
			@Override
			public void run() {
				String str = "SUNBEAM\n";
				synchronized(obj) 
				{ // lock the obj
					for (int i = 0; i < str.length(); i++) {
						System.out.print(str.charAt(i));
						delay(300);
					}
					obj.notify();
						// wakeup one of the thread sleeping on the object
				} // unlock the obj
				// ...
			}
		}
		SunbeamThread st = new SunbeamThread();
		
		class InfotechThread extends Thread {
			@Override
			public void run() {
				String str = "INFOTECH\n";
				synchronized(obj) {
					try {
						obj.wait();
							// 1. release the lock on the object
							// 2. make current thread sleep on the object
							// 3. after wakeup, lock the object and proceed
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					for (int i = 0; i < str.length(); i++) {
						System.out.print(str.charAt(i));
						delay(300);
					}
				}
				// ...
			}
		}
		InfotechThread it = new InfotechThread();
		
		it.start();
		st.start();
	}
}
