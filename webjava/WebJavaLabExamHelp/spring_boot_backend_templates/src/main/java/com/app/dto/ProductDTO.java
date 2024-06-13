package com.app.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.app.entities.ProductType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

	private int ProductId;

	@Length(min = 6)
	private String productName;

	@NotNull
	private String description;

	@NotNull
	private ProductType category;

	@NotNull
	private int providerId;

	@NotNull
	private boolean inStock;

	@NotNull
	private LocalDate productionDate;

}
