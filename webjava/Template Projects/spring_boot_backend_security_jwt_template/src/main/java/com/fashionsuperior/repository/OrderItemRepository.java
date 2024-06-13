package com.fashionsuperior.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fashionsuperior.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
