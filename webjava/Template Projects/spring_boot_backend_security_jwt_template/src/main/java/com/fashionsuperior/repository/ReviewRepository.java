package com.fashionsuperior.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fashionsuperior.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

	@Query("select r from Review r where r.product.id=:productId")
	public List<Review> getAllProductReview(@Param("productId") Long productId);

}
