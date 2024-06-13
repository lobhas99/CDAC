package com.fashionsuperior.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fashionsuperior.exception.ProductException;
import com.fashionsuperior.model.Product;
import com.fashionsuperior.model.Rating;
import com.fashionsuperior.model.User;
import com.fashionsuperior.repository.RatingRepository;
import com.fashionsuperior.request.RatingRequest;

@Service
public class RatingServiceImpl implements RatingService {
	private RatingRepository ratingRepository;
	private ProductService productService;

	public RatingServiceImpl(RatingRepository ratingRepository, ProductService productService) {
		this.ratingRepository = ratingRepository;
		this.productService = productService;
	}

	@Override
	public Rating createRating(RatingRequest req, User user) throws ProductException {
		Product product = productService.findProductById(req.getProductId());
		Rating rating = new Rating();
		rating.setProduct(product);
		rating.setUser(user);
		rating.setRating(req.getRating());
		rating.setCreatedAt(LocalDateTime.now());
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getProductsRating(Long productId) {
		return ratingRepository.getAllProductRating(productId);
	}


}
