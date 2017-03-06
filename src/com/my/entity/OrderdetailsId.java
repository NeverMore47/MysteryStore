package com.my.entity;

/**
 * OrderdetailsId entity. @author MyEclipse Persistence Tools
 */

public class OrderdetailsId implements java.io.Serializable {

	// Fields

	private Order order;
	private Product product;
	private Short quantity;
	private Double totalPrice;

	// Constructors

	/** default constructor */
	public OrderdetailsId() {
	}

	/** minimal constructor */
	public OrderdetailsId(Order order, Product product, Short quantity) {
		this.order = order;
		this.product = product;
		this.quantity = quantity;
	}

	/** full constructor */
	public OrderdetailsId(Order order, Product product, Short quantity,
			Double totalPrice) {
		this.order = order;
		this.product = product;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
	}

	// Property accessors

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
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

	public Double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OrderdetailsId))
			return false;
		OrderdetailsId castOther = (OrderdetailsId) other;

		return ((this.getOrder() == castOther.getOrder()) || (this.getOrder() != null
				&& castOther.getOrder() != null && this.getOrder().equals(
				castOther.getOrder())))
				&& ((this.getProduct() == castOther.getProduct()) || (this
						.getProduct() != null && castOther.getProduct() != null && this
						.getProduct().equals(castOther.getProduct())))
				&& ((this.getQuantity() == castOther.getQuantity()) || (this
						.getQuantity() != null
						&& castOther.getQuantity() != null && this
						.getQuantity().equals(castOther.getQuantity())))
				&& ((this.getTotalPrice() == castOther.getTotalPrice()) || (this
						.getTotalPrice() != null
						&& castOther.getTotalPrice() != null && this
						.getTotalPrice().equals(castOther.getTotalPrice())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getOrder() == null ? 0 : this.getOrder().hashCode());
		result = 37 * result
				+ (getProduct() == null ? 0 : this.getProduct().hashCode());
		result = 37 * result
				+ (getQuantity() == null ? 0 : this.getQuantity().hashCode());
		result = 37
				* result
				+ (getTotalPrice() == null ? 0 : this.getTotalPrice()
						.hashCode());
		return result;
	}

}