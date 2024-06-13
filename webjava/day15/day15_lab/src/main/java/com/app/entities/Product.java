package com.app.entities;

import java.time.LocalDate;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * , name (unique) , description ,category(enum) , price ,
 *  available stock(int),expiryDate:LocalDate

 */
@Entity
@Table(name = "products")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Product extends BaseEntity {
	@Column(length = 20)
	private String name;
	@Column(length = 200)
	private String description;
	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private Category category;
	private double price;
	private int availableStock;
	private LocalDate expDate;
}
