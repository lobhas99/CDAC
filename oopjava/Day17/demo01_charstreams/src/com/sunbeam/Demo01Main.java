package com.sunbeam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-08 08:42
 */

public class Demo01Main {
	/*
	public static void main(String[] args) {
		Charset charSet = Charset.forName("UTF-16");
		String line = "Diploma in Advanced Computing!"; // sc.nextLine();
		try(FileWriter wr = new FileWriter("demo.txt", charSet)) {
			wr.write(line);
			System.out.println("String saved: " + line.length());
		} // wr.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/
	
	public static void main(String[] args) {
		Charset charSet = Charset.forName("UTF-16");
		try(FileReader frd = new FileReader("demo.txt", charSet)) {
			try(BufferedReader brd = new BufferedReader(frd)) {
				String line = brd.readLine();
				System.out.println(line);
			}
		} // rd.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}



