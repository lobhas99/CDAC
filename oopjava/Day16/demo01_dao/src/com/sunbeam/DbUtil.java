package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-07 08:05
 */

public class DbUtil {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/test";
	public static final String DB_USER = "nilesh";
	public static final String DB_PASSWORD = "nilesh";
	
	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public static Connection getConnection() throws Exception {
		return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
	}
}





