package com.app.service;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.app.dto.ProductDTO;
import com.app.entities.Product;

public class ProductServiceImpl implements ProductService {

	@Override
	public String AddNewproduct(@Valid ProductDTO product) {
		
		return "Product Added";
	}

	@Override
	public ProductDTO UpdateProduct(@Valid ProductDTO product, Integer productId) {
		ProductDTO UpdatedProduct=product;
		return product;
	}


	@Override
	public List<Product> FindAllProductsbyProviderId(Integer provideId) {
		List<Product> product=new ArrayList();
		
		return product;
	}


	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findAllProductbyCategory(@Valid String category) {
		// TODO Auto-generated method stub
		return null;
	}

}
