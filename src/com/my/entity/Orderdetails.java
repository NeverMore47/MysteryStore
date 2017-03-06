package com.my.entity;

/**
 * Orderdetails entity. @author MyEclipse Persistence Tools
 */

public class Orderdetails implements java.io.Serializable {

	// Fields

	private OrderdetailsId id;
	private Product product;
	private Order order;

	// Constructors

	/** default constructor */
	public Orderdetails() {
	}

	/** full constructor */
	public Orderdetails(OrderdetailsId id, Product product, Order order) {
		this.id = id;
		this.product = product;
		this.order = order;
	}

	// Property accessors

	public OrderdetailsId getId() {
		return this.id;
	}

	public void setId(OrderdetailsId id) {
		this.id = id;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}