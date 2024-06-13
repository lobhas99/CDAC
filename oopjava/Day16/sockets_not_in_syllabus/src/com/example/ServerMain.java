package com.example;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Core Java
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-07
 */

public class ServerMain {
	public static final int PORT = 2809;

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		ServerSocket server = new ServerSocket(PORT);
		
		Socket client = server.accept();
		
		InputStream sin = client.getInputStream();
		DataInputStream din = new DataInputStream(sin);
		OutputStream sout = client.getOutputStream();
		DataOutputStream dout = new DataOutputStream(sout);

		String line1 = din.readUTF();
		System.out.println("Client: " + line1);

		System.out.print("Server: ");
		String line2 = sc.nextLine();
		dout.writeUTF(line2);
		
		client.close();
		server.close();
	}
}










