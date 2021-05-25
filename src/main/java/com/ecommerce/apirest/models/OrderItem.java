package com.ecommerce.apirest.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderItem implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy  = GenerationType.AUTO)
	private Long orderItemId;
	
	@ManyToOne
	@JoinColumn(name="productId")
	private Product product;	
	
	@ManyToOne
	@JoinColumn(name="orderId")
	private Order order;
	
	private int quantity;

	public Long getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(Long orderItemId) {
		this.orderItemId = orderItemId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
