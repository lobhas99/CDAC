package com.app.beans;


import java.time.LocalDate;
import java.time.Period;

import com.app.dao.PlayerDao;
import com.app.dao.PlayerDaoImpl;
import com.app.dao.TeamDao;
import com.app.dao.TeamDaoImpl;
import com.app.pojos.Player;
import com.app.pojos.Team;

public class PlayerBean {
	private int TeamId;
	private String fn;
	private String ln;
	private String dob;
	private double avg;
	private int wickets;
	private TeamDao teamDao;
	private PlayerDao playerDao;
	
	public PlayerBean(){
	teamDao=new TeamDaoImpl();
	playerDao=new PlayerDaoImpl();
	System.out.println();
	}

	public int getTeamId() {
		return TeamId;
	}

	public void setTeamId(int teamId) {
		TeamId = teamId;
	}

	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getLn() {
		return ln;
	}

	public void setLn(String ln) {
		this.ln = ln;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public TeamDao getTeamDao() {
		return teamDao;
	}

	public void setTeamDao(TeamDao teamDao) {
		this.teamDao = teamDao;
	}

	public PlayerDao getPlayerDao() {
		return playerDao;
	}

	public void setPlayerDao(PlayerDao playerDao) {
		this.playerDao = playerDao;
	}

	public String validateAndAddPlayer() {
		System.out.println("in validate n add");
		Team team=teamDao.GetTeamById(TeamId);
		if(team!=null) {
		LocalDate date=LocalDate.parse(dob);
		int age=Period.between(date, LocalDate.now()).getYears();
		if(age<team.getMaxAge() && avg>team.getBattingAvg()) {
			Player newPlayer=new Player(fn,ln,date,avg,wickets);
			return playerDao.addPlayerToTeam(team.getId(), newPlayer);
		}
		else
			return "Invalid details of player";
		}
		else return "Invalid Team";
	}
}
