package com.fashionsuperior.service;

import com.fashionsuperior.exception.ProductException;
import com.fashionsuperior.model.Cart;
import com.fashionsuperior.model.CartItem;
import com.fashionsuperior.model.User;
import com.fashionsuperior.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req )throws ProductException;
	
	public Cart findUserCart(Long userId);
	
}
