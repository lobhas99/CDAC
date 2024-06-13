package com.app.entity;

import javax.persistence.*;

@Entity
@Table(name = "teams")
public class Team {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "team_id", unique = true)
	private Long teamId;
	@Column(name = "name", length = 30, unique = true)
	private String name;
	@Column(name = "abbreviation", length = 4, unique = true)
	private String abbreviation;
	@Column(name = "owner", length = 10,nullable=false)
	private String owner;
	@Column(name = "max_age")
	private int maxAge;	
	@Column(name = "batting_avg")
	private double battingAvg;
	@Column(name = "wickets_taken")
	private int wicketsTaken;
	
	private void team() {

	}

	public Team(String name, String abbreviation, String owner, int maxAge, double battingAvg,
			int wicketsTaken) {
		this.name = name;
		this.abbreviation = abbreviation;
		this.owner = owner;
		this.maxAge = maxAge;
		this.battingAvg = battingAvg;
		this.wicketsTaken = wicketsTaken;
	}

	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	public double getBattingAvg() {
		return battingAvg;
	}

	public void setBattingAvg(double battingAvg) {
		this.battingAvg = battingAvg;
	}

	public int getWicketsTaken() {
		return wicketsTaken;
	}

	public void setWicketsTaken(int wicketsTaken) {
		this.wicketsTaken = wicketsTaken;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", name=" + name + ", abbreviation=" + abbreviation + ", owner=" + owner
				+ ", maxAge=" + maxAge + ", battingAvg=" + battingAvg + ", wicketsTaken=" + wicketsTaken + "]";
	}

}
