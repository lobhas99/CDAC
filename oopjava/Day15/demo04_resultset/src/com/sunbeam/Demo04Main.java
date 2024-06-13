package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-06 12:31
 */

public class Demo04Main {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/test";
	public static final String DB_USER = "nilesh";
	public static final String DB_PASSSWD = "nilesh";

	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	/*
	// forward traversal
	public static void main(String[] args) {
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSSWD)) {
			String sql = "SELECT * FROM candidates";
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
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
		System.out.println("Bye!");
	}
	*/

	/*
	// backward traversal
	public static void main(String[] args) {
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSSWD)) {
			String sql = "SELECT * FROM candidates";
			try(PreparedStatement stmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
				try(ResultSet rs = stmt.executeQuery()) {
					rs.afterLast(); // go to after last position
					while(rs.previous()) {
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
		System.out.println("Bye!");
	}
	*/
	
	/*
	// random access
	public static void main(String[] args) {
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSSWD)) {
			String sql = "SELECT * FROM candidates";
			try(PreparedStatement stmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
				try(ResultSet rs = stmt.executeQuery()) {
					if(rs.absolute(5)) // jump to 5th row 
					{
						int id = rs.getInt("id");
						String name = rs.getString("name");
						String party = rs.getString("party");
						int votes = rs.getInt("votes");
						System.out.printf("%d, %s, %s, %d\n", id, name, party, votes);
					}
					if(rs.relative(-3)) // jump to 5-3=2nd row 
					{
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
		System.out.println("Bye!");
	}
	*/

	// random access -- update row
	public static void main(String[] args) {
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSSWD)) {
			String sql = "SELECT * FROM candidates";
			try(PreparedStatement stmt = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
				try(ResultSet rs = stmt.executeQuery()) {
					if(rs.absolute(5)) // jump to 5th row 
					{
						int id = rs.getInt("id");
						String name = rs.getString("name");
						String party = rs.getString("party");
						int votes = rs.getInt("votes");
						System.out.printf("%d, %s, %s, %d\n", id, name, party, votes);
						
						rs.updateInt("votes", votes + 10); // changes in memory
						rs.updateRow(); // update in db
					}
				} // rs.close();
			} // stmt.close();
		} // con.close();
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Bye!");
	}
}
























