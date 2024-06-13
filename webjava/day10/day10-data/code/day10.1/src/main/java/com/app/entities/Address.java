package com.app.entities;

import javax.persistence.*;

@Entity
@Table(name = "emp_adr")
public class Address extends BaseEntity {
	@Column(length = 20)
	private String city;
	@Column(length = 20)
	private String state;
	@Column(length = 20)
	private String country;
	@Column(length = 10, name = "zip_code")
	private String zipCode;
	//Address 1--->1 Emp
	@OneToOne
	@JoinColumn(name="emp_id",nullable = false)
	@MapsId //cols : ..... +emp_id : PK ,FK
	private Employee myEmp;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String state, String country, String zipCode) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	

	public Employee getMyEmp() {
		return myEmp;
	}

	public void setMyEmp(Employee myEmp) {
		this.myEmp = myEmp;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + ", zipCode=" + zipCode + "]";
	}

}
