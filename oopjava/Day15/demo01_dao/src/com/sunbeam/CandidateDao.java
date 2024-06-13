package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-06 08:54
 */

public class CandidateDao implements AutoCloseable {
	private Connection con;
	
	public CandidateDao() throws Exception {
		con = DbUtil.getConnection();
	}
	public void close() {
		try {
			if (con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int save(Candidate c) throws Exception {
		String sql = "INSERT INTO candidates VALUES(default,?,?,?)";
		// TODO: Lab assignment
		return 0;
	}
	public int update(Candidate c) throws Exception {
		String sql = "UPDATE candidates SET name=?, party=?, votes=? WHERE id=?";
		try( PreparedStatement stmt = con.prepareStatement(sql) ) {
			stmt.setString(1, c.getName());
			stmt.setString(2, c.getParty());
			stmt.setInt(3, c.getVotes());
			stmt.setInt(4, c.getId());
			int count = stmt.executeUpdate();
			return count;
		} // stmt.close();
	}
	public int deleteById(int id) {
		String sql = "DELETE FROM candidates WHERE id=?";
		// TODO: Lab assignment
		return 0;
	}
	public Candidate findById(int id) {
		// TODO: Lab assignment
		return null;
	}
	public List<Candidate> findAll() {
		List<Candidate> list = new ArrayList<Candidate>();
		// TODO: Lab assignment
		return list;
	}
	public List<Candidate> findByParty(String party) throws Exception {
		List<Candidate> list = new ArrayList<Candidate>();
		String sql = "SELECT * FROM candidates WHERE party=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, party);
			try(ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					party = rs.getString("party");
					int votes = rs.getInt("votes");
					Candidate c = new Candidate(id, name, party, votes);
					list.add(c);
				}
			} // rs.close();
		} // stmt.close();
		return list;
	}
}
