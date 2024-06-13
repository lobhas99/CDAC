package com.sunbeam;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Types;
import java.util.Date;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-06 10:57
 */

public class Demo02Main {
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
	// call stored procedure without OUT param 
	public static void main(String[] args) {
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSSWD)) {
			String sql = "CALL sp_incrementvotes(?)";
			try(CallableStatement stmt = con.prepareCall(sql)) {
				int candId = 10; // sc.nextInt();
				stmt.setInt(1, candId);
				int cnt = stmt.executeUpdate();
				System.out.println("Rows affected: " + cnt);
			} // stmt.close();
		} // con.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/
	
	/*
	// call stored procedure with OUT param
	public static void main(String[] args) {
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSSWD)) {
			String sql = "CALL sp_getpartyvotes(?,?)";
			try(CallableStatement stmt = con.prepareCall(sql)) {
				String party = "SP"; // sc.next();
				int votes; // OUT param
				stmt.setString(1, party);
				stmt.registerOutParameter(2, Types.INTEGER);
				stmt.execute();
				votes = stmt.getInt(2);
				System.out.println("Party Votes: " + votes);
			} // stmt.close();
		} // con.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/
	
	public static void main(String[] args) {
		try(Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSSWD)) {
			String sql = "CALL sp_getpartywisevotes()";
			try(CallableStatement stmt = con.prepareCall(sql)) {
				try(ResultSet rs = stmt.executeQuery()) {
					while(rs.next()) {
						String party = rs.getString("party");
						int total = rs.getInt("total");
						System.out.printf("%s, %d\n", party, total);
					}
				} // rs.close();
			} // stmt.close();
		} // con.close();
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/*
```SQL
DELIMITER //

CREATE PROCEDURE sp_incrementvotes(IN p_id INT)
BEGIN
    UPDATE candidates SET votes=votes+1 WHERE id=p_id;
END;
//

DELIMITER ;
```

```SQL
CALL sp_incrementvotes(10);
```
*/

/*
```SQL
DELIMITER //

CREATE PROCEDURE sp_getpartyvotes(IN p_party CHAR(40), OUT p_votes INT) 
BEGIN
    SELECT SUM(votes) INTO p_votes FROM candidates WHERE party=p_party;
END;
//

DELIMITER ;
```
```SQL
CALL sp_getpartyvotes('BJP', @votes);

SELECT @votes;
```
*/

/*
```SQL
DELIMITER //

CREATE PROCEDURE sp_getpartywisevotes() 
BEGIN
    SELECT party, SUM(votes) total FROM candidates GROUP BY party;
END;
//

DELIMITER ;
```
```SQL
CALL sp_getpartywisevotes();
```
*/












