package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-04 13:15
 */

/*
public class Demo06Main {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/test";
	public static final String DB_USER = "nilesh";
	public static final String DB_PASSWORD = "nilesh";
	
	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
		
			String sql = "SELECT * FROM candidates WHERE votes > ?"; // parameterized query
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				
				System.out.print("Enter min votes: ");
				int minVotes = sc.nextInt();
				
				stmt.setInt(1, minVotes);
				try(ResultSet rs = stmt.executeQuery()) {
					while(rs.next()) {
						int id = rs.getInt("id");
						String name = rs.getString("name");
						String party = rs.getString("party");
						int votes = rs.getInt("votes");
						System.out.printf("%d, %s, %s, %d\n", id, name, party, votes);
					}
				} // rs.close();
			
			} // stmt.close(); 
			
		} // con.close(); 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
*/


public class Demo06Main {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/test";
	public static final String DB_USER = "nilesh";
	public static final String DB_PASSWORD = "nilesh";
	
	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
		
			String sql = "INSERT INTO candidates VALUES(default, ?, ?, ?)"; // parameterized query
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				System.out.print("Enter Name: ");
				String name = sc.next();
				System.out.print("Enter Party: ");
				String party = sc.next();
				System.out.print("Enter Votes: ");
				int votes = sc.nextInt();
				
				stmt.setString(1, name);
				stmt.setString(2, party);
				stmt.setInt(3, votes);
				
				int count = stmt.executeUpdate();
				System.out.println("Rows Affected: " + count);
			} // stmt.close(); 
			
		} // con.close(); 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
