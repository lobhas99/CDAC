package com.sunbeam.utils;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletContext;

public class DbUtil {
	public static ServletContext ctx = null;
	public static Connection getConnection() throws Exception {
		Connection con = (Connection) ctx.getAttribute("dbconn");
		return con;
	}
}
