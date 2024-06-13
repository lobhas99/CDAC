package com.fashionsuperior.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fashionsuperior.enums.UserRole;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User extends BaseEntity {

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Enumerated(EnumType.STRING)
	@Column(name = "role")
	private UserRole role;

	@Column(name = "mobile_no")
	private String mobile;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Address> address = new ArrayList<>();

	@Embedded
	@ElementCollection
	@CollectionTable(name = "payment_information", joinColumns = @JoinColumn(name = "user_id"))
	private List<PaymentInformation> paymentInformation = new ArrayList<>();

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Rating> ratings = new ArrayList<>();

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	@JsonIgnore
	private List<Review> reviews = new ArrayList<>();

	private LocalDateTime createdAt;

	public User() {

	}

	public User(Long id, String firstName, String lastName, String email, String password, UserRole role, String mobile,
			List<Address> address, List<PaymentInformation> paymentInformation, List<Rating> ratings,
			List<Review> reviews, LocalDateTime createdAt) {
		super(id);
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.role = role;
		this.mobile = mobile;
		this.address = address;
		this.paymentInformation = paymentInformation;
		this.ratings = ratings;
		this.reviews = reviews;
		this.createdAt = createdAt;
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

	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public List<PaymentInformation> getPaymentInformation() {
		return paymentInformation;
	}

	public void setPaymentInformation(List<PaymentInformation> paymentInformation) {
		this.paymentInformation = paymentInformation;
	}

	public List<Rating> getRatings() {
		return ratings;
	}

	public void setRatings(List<Rating> ratings) {
		this.ratings = ratings;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", role=" + role
				+ ", mobile=" + mobile + ", address=" + address + ", paymentInformation=" + paymentInformation
				+ ", ratings=" + ratings + ", reviews=" + reviews + ", createdAt=" + createdAt + "]";
	}

}
