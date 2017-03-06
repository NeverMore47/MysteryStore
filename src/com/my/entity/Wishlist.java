package com.my.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Wishlist entity. @author MyEclipse Persistence Tools
 */

public class Wishlist implements java.io.Serializable {

	// Fields

	private Short wlId;
	private Customer customer;
	private Set wishproductses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Wishlist() {
	}

	/** minimal constructor */
	public Wishlist(Customer customer) {
		this.customer = customer;
	}

	/** full constructor */
	public Wishlist(Customer customer, Set wishproductses) {
		this.customer = customer;
		this.wishproductses = wishproductses;
	}

	// Property accessors

	public Short getWlId() {
		return this.wlId;
	}

	public void setWlId(Short wlId) {
		this.wlId = wlId;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Set getWishproductses() {
		return this.wishproductses;
	}

	public void setWishproductses(Set wishproductses) {
		this.wishproductses = wishproductses;
	}

}