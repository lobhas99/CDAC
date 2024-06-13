package com.fashionsuperior.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cart extends BaseEntity {

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	@OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
	@Column(name = "cart_items")
	private Set<CartItem> cartItems = new HashSet<>();

	@Column(name = "total_price")
	private double totalPrice;

	@Column(name = "total_item")
	private int totalItem;
	private int totalDiscountedPrice;

	private int discount;

	public Cart() {
		// TODO Auto-generated constructor stub
	}

	public Cart(Long id, User user, Set<CartItem> cartItems, double totalPrice, int totalItem, int totalDiscountedPrice,
			int discount) {
		super(id);
		this.user = user;
		this.cartItems = cartItems;
		this.totalPrice = totalPrice;
		this.totalItem = totalItem;
		this.totalDiscountedPrice = totalDiscountedPrice;
		this.discount = discount;
	}

	public int getTotalDiscountedPrice() {
		return totalDiscountedPrice;
	}

	public void setTotalDiscountedPrice(int totalDiscountedPrice) {
		this.totalDiscountedPrice = totalDiscountedPrice;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(Set<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public int getTotalItem() {
		return totalItem;
	}

	public void setTotalItem(int totalItem) {
		this.totalItem = totalItem;
	}

	@Override
	public String toString() {
		return "Cart [user=" + user + ", cartItems=" + cartItems + ", totalPrice=" + totalPrice + ", totalItem="
				+ totalItem + ", totalDiscountedPrice=" + totalDiscountedPrice + ", discount=" + discount + "]";
	}
}
