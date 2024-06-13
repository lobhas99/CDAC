package com.sunbeam;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-09 09:05
 */

public class Demo01Main {
	public static void main(String[] args) throws Exception {
		System.out.println("Program started!");
		Runtime rt = Runtime.getRuntime();
		String[] cmdArgs = { "/usr/bin/firefox", "sunbeaminfo.in" };
		Process process = rt.exec(cmdArgs);
		int status = process.waitFor();
		System.out.println("Firefox exit status: " + status);
		System.out.println("Program terminated!");
	}
}
