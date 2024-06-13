package com.app.service;

import java.util.List;

import javax.validation.Valid;

import com.app.dto.ProductDTO;
import com.app.entities.Product;
import com.app.entities.ProductType;

public interface ProductService {

	String AddNewproduct(@Valid ProductDTO product);

	ProductDTO UpdateProduct(@Valid ProductDTO product, Integer productId);

	List<Product> findAll();

	List<Product> findAllProductbyCategory(@Valid String category);

	List<Product> FindAllProductsbyProviderId(Integer provideId);
	
}
