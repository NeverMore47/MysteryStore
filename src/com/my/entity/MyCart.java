package com.my.entity;

public class MyCart {

	private Short custId;
	private Short proId;
	private Short quantity;

	public Short getQuantity() {
		return quantity;
	}

	public void setQuantity(Short quantity) {
		this.quantity = quantity;
	}

	public Short getCustId() {
		return custId;
	}

	public void setCustId(Short custId) {
		this.custId = custId;
	}

	public Short getProId() {
		return proId;
	}

	public MyCart() {
		super();
	}

	public MyCart(Short custId, Short proId, Short quantity) {
		super();
		this.custId = custId;
		this.proId = proId;
		this.quantity = quantity;
	}

	public void setProId(Short proId) {
		this.proId = proId;
	}

}
