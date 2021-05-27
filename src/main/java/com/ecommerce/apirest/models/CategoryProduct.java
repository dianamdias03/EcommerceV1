package com.ecommerce.apirest.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CategoryProduct implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy  = GenerationType.AUTO)
	private Long categoryProductId;
	
	@ManyToOne
	@JoinColumn(name="productId")
	private Product product;	
	
	@ManyToOne
	@JoinColumn(name="categoryId")
	private Category category;

	public Long getCategoryProductId() {
		return categoryProductId;
	}

	public void setCategoryProductId(Long categoryProductId) {
		this.categoryProductId = categoryProductId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
