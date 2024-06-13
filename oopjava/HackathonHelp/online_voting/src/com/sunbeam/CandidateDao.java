package com.sunbeam;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CandidateDao extends Dao {

	public CandidateDao() throws Exception {

	}
	
	// delete given candidate
	public int deleteById(int id) throws Exception {
		String sql = "DELETE FROM candidates WHERE id=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, id);
			int cnt = stmt.executeUpdate();
			return cnt;
		} //stmt.close();
	}
	
	// get all candidates
	public List<Candidate> findAll() throws Exception {
		List<Candidate> list = new ArrayList<>();
		String sql = "SELECT * FROM candidates";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			try(ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					String party = rs.getString("party");
					int votes = rs.getInt("votes");
					Candidate c = new Candidate(id, name, party, votes);
					list.add(c);
				}
			} // rs.close();
		} // stmt.close();
		return list;
	}
	
	// increment candidate vote
	public int incrementVote(int candidateId) throws Exception {
		String sql = "UPDATE candidates SET votes=votes+1 WHERE id=?";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, candidateId);
			int cnt = stmt.executeUpdate();
			return cnt; 
		} //stmt.close();
	}
	
	// get partywise vote count
	public List<PartyVotes> getPartywiseVotes() throws Exception {
		List<PartyVotes> list = new ArrayList<>();
		String sql = "SELECT party, SUM(votes) total FROM candidates GROUP BY party";
		try(PreparedStatement stmt = con.prepareStatement(sql)) {
			try(ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
					String party = rs.getString("party");
					int votes = rs.getInt("total");
					PartyVotes pv = new PartyVotes(party, votes);
					list.add(pv);
				}
			} // rs.close();
		} // stmt.close();
		return list;		
	}
	
	// TODO write rest of relevant functions here
}





