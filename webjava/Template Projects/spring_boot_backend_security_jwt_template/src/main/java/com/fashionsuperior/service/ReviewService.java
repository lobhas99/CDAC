package com.fashionsuperior.service;

import java.util.List;

import com.fashionsuperior.exception.ProductException;
import com.fashionsuperior.model.Review;
import com.fashionsuperior.model.User;
import com.fashionsuperior.request.ReviewRequest;

public interface ReviewService {
	
	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
}
