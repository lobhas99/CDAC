package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Product;
import com.app.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	// dep
	@Autowired
	private ProductService prodService;

	@GetMapping
	public List<Product> getAllProducts() {
		return prodService.getAllProducts();
	}
}
