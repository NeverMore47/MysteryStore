package com.my.entity;

/**
 * Cart entity. @author MyEclipse Persistence Tools
 */

public class Cart implements java.io.Serializable {

	// Fields

	private CartId id;
	private Customer customer;
	private Product product;

	// Constructors

	/** default constructor */
	public Cart() {
	}

	/** minimal constructor */
	public Cart(CartId id) {
		this.id = id;
	}

	/** full constructor */
	public Cart(CartId id, Customer customer, Product product) {
		this.id = id;
		this.customer = customer;
		this.product = product;
	}

	// Property accessors

	public CartId getId() {
		return this.id;
	}

	public void setId(CartId id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}