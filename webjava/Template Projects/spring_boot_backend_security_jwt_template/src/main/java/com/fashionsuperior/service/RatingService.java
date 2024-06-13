package com.fashionsuperior.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fashionsuperior.exception.ProductException;
import com.fashionsuperior.model.Rating;
import com.fashionsuperior.model.User;
import com.fashionsuperior.request.RatingRequest;

@Service
public interface RatingService {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);
		
} 
