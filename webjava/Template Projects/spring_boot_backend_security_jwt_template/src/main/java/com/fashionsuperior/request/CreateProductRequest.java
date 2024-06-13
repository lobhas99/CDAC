package com.fashionsuperior.request;

import java.util.HashSet;
import java.util.Set;

import com.fashionsuperior.model.Size;

public class CreateProductRequest {
	private String title;
	private String description;
	private int price;
	private int discountedPrice;
	private int discountPercent;
	private int quantity;
	private String brand;
	private String colour;
	private Set<Size>size=new HashSet<>();
	private String imageUrl;
	private String masterCategory;
	private String parentCategory;
	private String mainCategory;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscountedPrice() {
		return discountedPrice;
	}
	public void setDiscountedPrice(int discountedPrice) {
		this.discountedPrice = discountedPrice;
	}
	public int getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Set<Size> getSize() {
		return size;
	}
	public void setSize(Set<Size> size) {
		this.size = size;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getMasterCategory() {
		return masterCategory;
	}
	public void setMasterCategory(String masterCategory) {
		this.masterCategory = masterCategory;
	}
	public String getParentCategory() {
		return parentCategory;
	}
	public void setParentCategory(String parentCategory) {
		this.parentCategory = parentCategory;
	}
	public String getMainCategory() {
		return mainCategory;
	}
	public void setMainCategory(String mainCategory) {
		this.mainCategory = mainCategory;
	}
	
	
}
