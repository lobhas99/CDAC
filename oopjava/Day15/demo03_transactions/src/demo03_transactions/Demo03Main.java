package demo03_transactions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-06 12:12
 */

public class Demo03Main {
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

	public static void main(String[] args) throws Exception {
		int fromAccId = 1; // sc.nextInt();
		int toAccId = 20; // sc.nextInt();
		double amount = 4000.0; // sc.nextDouble();
		Connection con = null;
		try {
			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSSWD);
			
			String sql = "UPDATE accounts SET balance=balance+? WHERE id=?";
			try(PreparedStatement stmt = con.prepareStatement(sql)) {
				// START TRANSACTION;
				con.setAutoCommit(false);
				// debit fromAccId
				stmt.setDouble(1, -amount);
				stmt.setInt(2, fromAccId);
				int cnt1 = stmt.executeUpdate();
				// credit toAccId
				stmt.setDouble(1, amount);
				stmt.setInt(2, toAccId);
				int cnt2 = stmt.executeUpdate();
				
				if(cnt1 != 1 || cnt2 != 1) // transfer failed
					throw new RuntimeException("Transfer Failed");
				
				System.out.println("Tranfer done.");
				// COMMIT;
				con.commit();
			} // stmt.close();
		} // con.close();
		catch (Exception e) {
			// ROLLBACK;
			con.rollback();
			e.printStackTrace();
		}
		finally {
			con.close();
		}
	}
}




















