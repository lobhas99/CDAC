package com.fashionsuperior.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fashionsuperior.exception.ProductException;
import com.fashionsuperior.model.Product;
import com.fashionsuperior.model.Review;
import com.fashionsuperior.model.User;
import com.fashionsuperior.repository.ReviewRepository;
import com.fashionsuperior.request.ReviewRequest;

@Service
class ReviewServiceImpl implements ReviewService {

	private ReviewRepository reviewRepository;
	private ProductService productService;
	
	
	public ReviewServiceImpl(ReviewRepository reviewRepository, ProductService productService) {
		this.reviewRepository = reviewRepository;
		this.productService = productService;
	}

	@Override
	public Review createReview(ReviewRequest req, User user) throws ProductException {
		Product product=productService.findProductById(req.getProductId());
		Review review=new Review();
		review.setUser(user);
		review.setProduct(product);
		review.setReview(req.getReview());
		review.setCreatedAt(LocalDateTime.now());
		return reviewRepository.save(review);
	}

	@Override
	public List<Review> getAllReview(Long productId) {
		return reviewRepository.getAllProductReview(productId);
	}

}
