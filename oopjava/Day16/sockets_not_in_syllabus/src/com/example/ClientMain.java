package com.example;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * Core Java
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-07
 */

public class ClientMain {
	
	public static final String HOST = "localhost";
	
	public static final int PORT = 2809;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Socket client = new Socket(HOST, PORT);

		InputStream sin = client.getInputStream();
		DataInputStream din = new DataInputStream(sin);
		OutputStream sout = client.getOutputStream();
		DataOutputStream dout = new DataOutputStream(sout);
		
		System.out.print("Client: ");
		String line1 = sc.nextLine();
		dout.writeUTF(line1);
		
		String line2 = din.readUTF();
		System.out.println("Server: " + line2);
		
		client.close();
	}
}










