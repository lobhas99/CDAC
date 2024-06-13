package com.sunbeam;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-07 11:26
 */

public class Demo03Main {
	public static void main(String[] args) {
		int b;
		String srcFilePath = "/home/nilesh/Pictures/JavaSockets.png"; // sc.nextLine();
		String destFilePath = "/home/nilesh/Pictures/CopyOfJavaSockets.png"; // sc.nextLine();
		try(FileInputStream fin = new FileInputStream(srcFilePath)) {
			try(FileOutputStream fout = new FileOutputStream(destFilePath)) {
				while( (b = fin.read()) != -1 ) {
					fout.write(b);
				}
			} // fout.close();
		} // fin.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("File Copied.");
	}
	/*
	public static void main(String[] args) throws Exception {
		int b;
		String srcFilePath = "/home/nilesh/books.java"; // sc.nextLine();
		String destFilePath = "/home/nilesh/test.java"; // sc.nextLine();
		FileInputStream fin = new FileInputStream(srcFilePath);
		FileOutputStream fout = new FileOutputStream(destFilePath);
		while( (b = fin.read()) != -1 ) {
			fout.write(b);
		}
		fout.close();
		fin.close();
		System.out.println("File Copied.");
	}
	*/
}











