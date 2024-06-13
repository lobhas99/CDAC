package com.sunbeam;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-07 09:13
 */

/*
Input a path from the user.
If path is invalid, give error and exit.
If path is of directory, list the contents of that directory.
If path is of file, display file information (name, parent dir, size, permissions, timestamp, ...).
If path is neither of file, nor of directory, then give error. 
*/

public class Demo02Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a path: ");
		String path = sc.nextLine();
		File file = new File(path);
		if(!file.exists()) {
			System.out.println("Invalid path!");
			System.exit(0);
		}
		if(file.isDirectory()) {
			System.out.println("Directory Contents: ");
			String[] listing = file.list();
			for (String entry : listing)
				System.out.println(entry);
		}
		else if(file.isFile()) {
			System.out.println("Name: " + file.getName());
			System.out.println("Parent Dir: " + file.getParent());
			System.out.println("Size: " + file.length() + " bytes");
			//file.setWritable(false);
			String r = file.canRead() ? "r" : "-";
			String w = file.canWrite() ? "w" : "-";
			String x = file.canExecute() ? "x" : "-";
			System.out.println("Permissions: " + r + w + x);
			long milli = file.lastModified(); // returns timestamp i.e. milliseconds from 1-JAN-1970
			Date modTime = new Date(milli);
			System.out.println("Last Modified: " + modTime);
			System.out.println("Is Hidden: " + file.isHidden());
		}
		else
			System.out.println("Neither file nor directory.");
	}
}











