package com.my.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */

public class Customer implements java.io.Serializable {

	// Fields

	private Short custId;
	private String custName;
	private String custPwd;
	private String custEmail;
	private String custGender;
	private String custBirthday;
	private Set orders = new HashSet(0);
	private Set wishlists = new HashSet(0);
	private Set reviews = new HashSet(0);
	private Set carts = new HashSet(0);

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** minimal constructor */
	public Customer(String custName, String custPwd, String custGender) {
		this.custName = custName;
		this.custPwd = custPwd;
		this.custGender = custGender;
	}

	/** full constructor */
	public Customer(String custName, String custPwd, String custEmail,
			String custGender, String custBirthday, Set orders, Set wishlists,
			Set reviews, Set carts) {
		this.custName = custName;
		this.custPwd = custPwd;
		this.custEmail = custEmail;
		this.custGender = custGender;
		this.custBirthday = custBirthday;
		this.orders = orders;
		this.wishlists = wishlists;
		this.reviews = reviews;
		this.carts = carts;
	}

	// Property accessors

	public Short getCustId() {
		return this.custId;
	}

	public void setCustId(Short custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return this.custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustPwd() {
		return this.custPwd;
	}

	public void setCustPwd(String custPwd) {
		this.custPwd = custPwd;
	}

	public String getCustEmail() {
		return this.custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getCustGender() {
		return this.custGender;
	}

	public void setCustGender(String custGender) {
		this.custGender = custGender;
	}

	public String getCustBirthday() {
		return this.custBirthday;
	}

	public void setCustBirthday(String custBirthday) {
		this.custBirthday = custBirthday;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

	public Set getWishlists() {
		return this.wishlists;
	}

	public void setWishlists(Set wishlists) {
		this.wishlists = wishlists;
	}

	public Set getReviews() {
		return this.reviews;
	}

	public void setReviews(Set reviews) {
		this.reviews = reviews;
	}

	public Set getCarts() {
		return this.carts;
	}

	public void setCarts(Set carts) {
		this.carts = carts;
	}

}