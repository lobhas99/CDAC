package com.sunbeam;

import java.util.Date;

enum Role {
	admin, voter;

	public static Role parse(String str) {
		try {
			return Role.valueOf(str);
		} catch (Exception e) {
			return voter;
		}
	}
}

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private Date birth;
	private boolean status;
	private Role role;

	public User() {
		this(0, "", "", "", "", null, false, Role.voter);
	}

	public User(int id, String firstName, String lastName, String email, String password, Date birth, boolean status,
			Role role) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.birth = birth;
		this.status = status;
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", birth=" + DateUtil.toString(birth) + ", status=" + (status?"voted":"not voted") + ", role=" + role + "]";
	}
}
