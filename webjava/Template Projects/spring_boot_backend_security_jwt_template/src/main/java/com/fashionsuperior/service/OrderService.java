package com.fashionsuperior.service;

import java.util.List;

import com.fashionsuperior.exception.OrderException;
import com.fashionsuperior.model.Address;
import com.fashionsuperior.model.Order;
import com.fashionsuperior.model.User;

public interface OrderService  {
	public Order createOrder(User user, Address shippingAdress);
	
	public Order findOrderById(Long orderId) throws OrderException;
	
	public List<Order> usersOrderHistory(Long userId);
	
	public Order placedOrder(Long orderId) throws OrderException;
	
	public Order confirmedOrder(Long orderId)throws OrderException;
	
	public Order shippedOrder(Long orderId) throws OrderException;
	
	public Order deliveredOrder(Long orderId) throws OrderException;
	
	public Order cancelledOrder(Long orderId) throws OrderException;
	
	public List<Order>getAllOrders();
	
	public void deleteOrder(Long orderId) throws OrderException;

}
