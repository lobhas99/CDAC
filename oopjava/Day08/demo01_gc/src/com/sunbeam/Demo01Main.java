package com.sunbeam;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-10-27 09:06
 */

class MyResource {
	// resource
	public MyResource() {
		System.out.println("Resource is created.");
	}
	// ...
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Resource is closed.");
	}
}

public class Demo01Main {
	public static void main(String[] args) {
		MyResource mr = new MyResource();
		mr = null;
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total Memory (MB): " + rt.totalMemory() / 1024.0 / 1024.0 );
		System.out.println("Free Memory (MB): " + rt.freeMemory() / 1024.0 / 1024.0 );
		rt.gc(); // request garbage collector
		//System.gc();	// internally --> Runtime.getRuntime().gc(); 
		System.out.println("Bye!");
	}
}











