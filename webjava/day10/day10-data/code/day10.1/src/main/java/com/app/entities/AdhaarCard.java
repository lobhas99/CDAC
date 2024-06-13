package com.app.entities;

import java.time.LocalDate;
import javax.persistence.*;

@Embeddable //mandatory cls level anno.
public class AdhaarCard {
	@Column(length = 12,unique = true,name="card_number")
	private String cardNumber;
	@Column(name="created_on")
	private LocalDate createdOn;
	@Column(length = 20)
	private String location;
	public AdhaarCard() {
		// TODO Auto-generated constructor stub
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public LocalDate getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "AdhaarCard [cardNumber=" + cardNumber + ", createdOn=" + createdOn + ", location=" + location + "]";
	}
	
}
