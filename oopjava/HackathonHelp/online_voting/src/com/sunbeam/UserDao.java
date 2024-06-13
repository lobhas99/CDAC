package com.sunbeam;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class UserDao extends Dao {
	
	public UserDao() throws Exception {
	}
	
	public int save(User u) throws Exception {
		String sql = "INSERT INTO users VALUES(default, ?, ?, ?, ?, ?, ?, ?)";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, u.getFirstName());
			stmt.setString(2, u.getLastName());
			stmt.setString(3, u.getEmail());
			stmt.setString(4, u.getPassword());
			stmt.setDate(5, DateUtil.utilToSqlDate(u.getBirth()));
			stmt.setBoolean(6, u.getStatus());
			stmt.setString(7, u.getRole().toString());
			int count = stmt.executeUpdate();
			return count;
		} //stmt.close();
	}
	
	public int markVoted(int userId) throws Exception {
		String sql = "UPDATE users SET status=true WHERE id=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, userId);
			int count = stmt.executeUpdate();
			return count;
		} //stmt.close();		
	}
	
	
	public User findByEmail(String email) throws Exception {
		String sql = "SELECT * FROM users WHERE email=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, email);
			try(ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
					int id = rs.getInt("id");
					String fname = rs.getString("first_name");
					String lname = rs.getString("last_name");
					String password = rs.getString("password");
					boolean status = rs.getBoolean("status");
					Date uDate = DateUtil.sqlToUtilDate(rs.getDate("dob"));
					Role role = Role.parse(rs.getString("role"));
					return new User(id, fname, lname, email, password, uDate, status, role);
				}
			} // rs.close();
		} // stmt.close();
		return null;
	}

	// TODO write rest of relevant functions here
}



