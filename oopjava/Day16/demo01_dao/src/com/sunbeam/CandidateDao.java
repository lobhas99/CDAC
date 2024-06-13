package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Core Java @ Sunbeam DAC Sep 2023
 * Author: Nilesh Ghule <nilesh@sunbeaminfo.com>
 * Time: 2023-11-07 08:45
 */

public class CandidateDao implements AutoCloseable {
	private Connection con;
	private PreparedStatement stmtFindAll;
	
	public CandidateDao() throws Exception {
		con = DbUtil.getConnection();
		String sql = "SELECT * FROM candidates";
		stmtFindAll = con.prepareStatement(sql);
	}
	
	@Override
	public void close() {
		try {
			if(stmtFindAll != null)
				stmtFindAll.close();
			if(con != null)
				con.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public List<Candidate> findAll() throws Exception {
		List<Candidate> list = new ArrayList<Candidate>();
		try(ResultSet rs = stmtFindAll.executeQuery()) {
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String party = rs.getString("party");
				int votes = rs.getInt("votes");
				Candidate c = new Candidate(id, name, party, votes);
				list.add(c);
			}
		} // rs.close();
		return list;

	}
}


















