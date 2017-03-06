package com.my.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable {

	// Fields

	private Short orderId;
	private Customer customer;
	private String orderDate;
	private String shipName;
	private String shipPhone;
	private String shipCode;
	private Double freight;
	private String orderAddress;
	private Set orderdetailses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(Customer customer, String orderDate, String shipName,
			String shipPhone, String orderAddress) {
		this.customer = customer;
		this.orderDate = orderDate;
		this.shipName = shipName;
		this.shipPhone = shipPhone;
		this.orderAddress = orderAddress;
	}

	/** full constructor */
	public Order(Customer customer, String orderDate, String shipName,
			String shipPhone, String shipCode, Double freight,
			String orderAddress, Set orderdetailses) {
		this.customer = customer;
		this.orderDate = orderDate;
		this.shipName = shipName;
		this.shipPhone = shipPhone;
		this.shipCode = shipCode;
		this.freight = freight;
		this.orderAddress = orderAddress;
		this.orderdetailses = orderdetailses;
	}

	// Property accessors

	public Short getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Short orderId) {
		this.orderId = orderId;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getShipName() {
		return this.shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public String getShipPhone() {
		return this.shipPhone;
	}

	public void setShipPhone(String shipPhone) {
		this.shipPhone = shipPhone;
	}

	public String getShipCode() {
		return this.shipCode;
	}

	public void setShipCode(String shipCode) {
		this.shipCode = shipCode;
	}

	public Double getFreight() {
		return this.freight;
	}

	public void setFreight(Double freight) {
		this.freight = freight;
	}

	public String getOrderAddress() {
		return this.orderAddress;
	}

	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}

	public Set getOrderdetailses() {
		return this.orderdetailses;
	}

	public void setOrderdetailses(Set orderdetailses) {
		this.orderdetailses = orderdetailses;
	}

}