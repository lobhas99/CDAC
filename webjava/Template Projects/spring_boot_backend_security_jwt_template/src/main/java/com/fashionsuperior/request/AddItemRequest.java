package com.fashionsuperior.request;

public class AddItemRequest {
	private Long productId;
	private String size;
	private int Quantity;
	private Integer price;

	public AddItemRequest() {
	}

	public AddItemRequest(Long productId, String size, int quantity, Integer price) {
		this.productId = productId;
		this.size = size;
		Quantity = quantity;
		this.price = price;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
}
