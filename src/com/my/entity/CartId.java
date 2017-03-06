package com.my.entity;

/**
 * CartId entity. @author MyEclipse Persistence Tools
 */

public class CartId implements java.io.Serializable {

	// Fields

	private Customer customer;
	private Product product;
	private Short quantity;

	// Constructors

	/** default constructor */
	public CartId() {
	}

	/** full constructor */
	public CartId(Customer customer, Product product, Short quantity) {
		this.customer = customer;
		this.product = product;
		this.quantity = quantity;
	}

	// Property accessors

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

	public Short getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Short quantity) {
		this.quantity = quantity;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CartId))
			return false;
		CartId castOther = (CartId) other;

		return ((this.getCustomer() == castOther.getCustomer()) || (this
				.getCustomer() != null && castOther.getCustomer() != null && this
				.getCustomer().equals(castOther.getCustomer())))
				&& ((this.getProduct() == castOther.getProduct()) || (this
						.getProduct() != null && castOther.getProduct() != null && this
						.getProduct().equals(castOther.getProduct())))
				&& ((this.getQuantity() == castOther.getQuantity()) || (this
						.getQuantity() != null
						&& castOther.getQuantity() != null && this
						.getQuantity().equals(castOther.getQuantity())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCustomer() == null ? 0 : this.getCustomer().hashCode());
		result = 37 * result
				+ (getProduct() == null ? 0 : this.getProduct().hashCode());
		result = 37 * result
				+ (getQuantity() == null ? 0 : this.getQuantity().hashCode());
		return result;
	}

}