package com.my.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Review entity. @author MyEclipse Persistence Tools
 */

public class Review implements java.io.Serializable {

	// Fields

	private Short reId;
	private Customer customer;
	private Short reRating;
	private String reContent;
	private String reDate;
	private Set products = new HashSet(0);

	// Constructors

	/** default constructor */
	public Review() {
	}

	/** minimal constructor */
	public Review(Customer customer, String reDate) {
		this.customer = customer;
		this.reDate = reDate;
	}

	/** full constructor */
	public Review(Customer customer, Short reRating, String reContent,
			String reDate, Set products) {
		this.customer = customer;
		this.reRating = reRating;
		this.reContent = reContent;
		this.reDate = reDate;
		this.products = products;
	}

	// Property accessors

	public Short getReId() {
		return this.reId;
	}

	public void setReId(Short reId) {
		this.reId = reId;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Short getReRating() {
		return this.reRating;
	}

	public void setReRating(Short reRating) {
		this.reRating = reRating;
	}

	public String getReContent() {
		return this.reContent;
	}

	public void setReContent(String reContent) {
		this.reContent = reContent;
	}

	public String getReDate() {
		return this.reDate;
	}

	public void setReDate(String reDate) {
		this.reDate = reDate;
	}

	public Set getProducts() {
		return this.products;
	}

	public void setProducts(Set products) {
		this.products = products;
	}

}