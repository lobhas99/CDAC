package com.fashionsuperior.service;

import com.fashionsuperior.exception.CartItemException;
import com.fashionsuperior.exception.UserException;
import com.fashionsuperior.model.Cart;
import com.fashionsuperior.model.CartItem;
import com.fashionsuperior.model.Product;

public interface CartItemService {

	public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userid,Long id,CartItem cartItem) throws CartItemException,UserException;
	
	public CartItem isCartItemExist(Cart cart,Product product,String size,Long userId);
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException,UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
}
