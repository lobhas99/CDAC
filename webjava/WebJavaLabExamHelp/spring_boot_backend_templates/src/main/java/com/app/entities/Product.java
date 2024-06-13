package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Product extends BaseEntity {

	@Column(name = "product_name",length = 6)
	private String productName;

	@Column
	private String description;

	@Enumerated(EnumType.STRING)
	private ProductType category;
	
	@Column
	private int providerId;
	
	@Column
	private boolean inStock;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate productionDate;
	

}
