package com.fashionsuperior.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CartItem extends BaseEntity{
	
	
	@JsonIgnore
	@ManyToOne
	private Cart cart;
	
	@ManyToOne
	private Product product;
	
	private String size;
	
	private int quantity;
	
	private Integer price;
	
	private Integer discountedPrice;
	
	private Long userId;
	
	public CartItem() {
		
	}

	public CartItem(Long id, Cart cart, Product product, String size, int quantity, Integer price,
			Integer discountedPrice, Long userId) {
		super(id);
		this.cart = cart;
		this.product = product;
		this.size = size;
		this.quantity = quantity;
		this.price = price;
		this.discountedPrice = discountedPrice;
		this.userId = userId;
	}


	public Integer getDiscountedPrice() {
		return discountedPrice;
	}

	public void setDiscountedPrice(Integer discountedPrice) {
		this.discountedPrice = discountedPrice;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}


	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cart, discountedPrice, price, product, quantity, size, userId);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartItem other = (CartItem) obj;
		return Objects.equals(cart, other.cart) && Objects.equals(discountedPrice, other.discountedPrice)
				&& Objects.equals(price, other.price) && Objects.equals(product, other.product)
				&& quantity == other.quantity && Objects.equals(size, other.size)
				&& Objects.equals(userId, other.userId);
	}

	@Override
	public String toString() {
		return "CartItem [cart=" + cart + ", product=" + product + ", size=" + size + ", quantity=" + quantity
				+ ", price=" + price + ", discountedPrice=" + discountedPrice + ", userId=" + userId + "]";
	}

	


}