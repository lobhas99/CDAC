package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.ProductDao;
import com.app.entities.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {
	//dep
	@Autowired
	private ProductDao prodDao;

	@Override
	public List<Product> getAllProducts() {		
		return prodDao.findAll();
	}

}
