package com.fashionsuperior.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fashionsuperior.model.OrderItem;
import com.fashionsuperior.repository.OrderItemRepository;

@Service
public class OrderItemServiceImpl implements OrderItemService {

	@Autowired
	private OrderItemRepository orderItemRepository;

	public OrderItemServiceImpl(OrderItemRepository orderItemRepository) {
		this.orderItemRepository = orderItemRepository;
	}

	@Override
	public OrderItem createOrderItem(OrderItem orderItem) {

		return orderItemRepository.save(orderItem);
	}
}
