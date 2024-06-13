package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-04 12:47
 */

/*
public class Demo05Main {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "nilesh", "nilesh");
	
		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("SELECT * FROM candidates");
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String party = rs.getString("party");
			int votes = rs.getInt("votes");
			System.out.printf("%d, %s, %s, %d\n", id, name, party, votes);
		}
		rs.close();
		
		stmt.close();
		con.close();
	}
}
*/

/*
public class Demo05Main {
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
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
		
			try(Statement stmt = con.createStatement()) {
		
				String sql = "SELECT * FROM candidates";
				try(ResultSet rs = stmt.executeQuery(sql)) {
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

public class Demo05Main {
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
		
			try(Statement stmt = con.createStatement()) {
				
				System.out.print("Enter min votes: ");
				String minVotes = sc.nextLine();
					
				String sql = "SELECT * FROM candidates WHERE votes > " + minVotes;
				System.out.println("Query: " + sql);
				try(ResultSet rs = stmt.executeQuery(sql)) {
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




