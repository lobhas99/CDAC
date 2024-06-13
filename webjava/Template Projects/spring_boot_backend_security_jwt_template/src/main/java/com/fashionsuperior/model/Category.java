package com.fashionsuperior.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Category extends BaseEntity {

	
	@NotNull
	private String name;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "parent_category_id")
	private Category parentCategory;

	private int level;

	public Category() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public Category getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	
}
