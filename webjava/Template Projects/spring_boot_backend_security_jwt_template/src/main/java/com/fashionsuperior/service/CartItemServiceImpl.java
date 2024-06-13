package com.fashionsuperior.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fashionsuperior.exception.CartItemException;
import com.fashionsuperior.exception.UserException;
import com.fashionsuperior.model.Cart;
import com.fashionsuperior.model.CartItem;
import com.fashionsuperior.model.Product;
import com.fashionsuperior.model.User;
import com.fashionsuperior.repository.CartItemRepository;

@Service
public class CartItemServiceImpl implements CartItemService {

	private CartItemRepository cartItemRepository;
	private UserService userService;

	public CartItemServiceImpl() {
	}

	public CartItemServiceImpl(CartItemRepository cartItemRepository, UserService userService) {
		this.cartItemRepository = cartItemRepository;
		this.userService = userService;
	}

	@Override
	public CartItem createCartItem(CartItem cartItem) {
		cartItem.setQuantity(1);
		cartItem.setPrice(cartItem.getProduct().getPrice()*cartItem.getQuantity());
		cartItem.setDiscountedPrice(cartItem.getProduct().getDiscountedPrice()*cartItem.getQuantity());
		CartItem createdCartItem=cartItemRepository.save(cartItem);
		return createdCartItem;
	}
	
	@Override
	public CartItem updateCartItem(Long userid, Long id, CartItem cartItem) throws CartItemException, UserException {
		CartItem item=findCartItemById(id);
		User user=userService.findUserById(userid);
		if(user.getId().equals(userid)) {
			item.setQuantity(cartItem.getQuantity());
			item.setPrice(item.getQuantity()*item.getProduct().getPrice());
			item.setDiscountedPrice(item.getProduct().getDiscountedPrice()*item.getQuantity());
		}
		return cartItemRepository.save(item);
	}

	@Override
	public CartItem isCartItemExist(Cart cart, Product product, String size, Long userId) {
		CartItem item=cartItemRepository.isCartItemExist(cart, product, size, userId);
			return item;
		}

	@Override
	public void removeCartItem(Long userId, Long cartItemId) throws CartItemException, UserException {
		CartItem cartItem=findCartItemById(cartItemId);
		User user=userService.findUserById(cartItem.getUserId());
		User reqUser=userService.findUserById(userId);
		if(user.getId().equals(reqUser.getId()))
			cartItemRepository.deleteById(cartItemId);
		else throw new UserException("Cannot Remove Another User's Items");
		
	}

	@Override
	public CartItem findCartItemById(Long cartItemId) throws CartItemException {
		Optional<CartItem> opt=cartItemRepository.findById(cartItemId);
		if(opt.isPresent())
			return opt.get();
		throw new CartItemException("Cart Item Not Found With Id");
	}

}
