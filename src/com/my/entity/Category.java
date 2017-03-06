package com.my.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Category entity. @author MyEclipse Persistence Tools
 */

public class Category implements java.io.Serializable {

	// Fields

	private Short cateId;
	private String cateName;
	private String cateDesc;
	private Set products = new HashSet(0);
	private Set types = new HashSet(0);

	// Constructors

	/** default constructor */
	public Category() {
	}

	/** minimal constructor */
	public Category(String cateName) {
		this.cateName = cateName;
	}

	/** full constructor */
	public Category(String cateName, String cateDesc, Set products, Set types) {
		this.cateName = cateName;
		this.cateDesc = cateDesc;
		this.products = products;
		this.types = types;
	}

	// Property accessors

	public Short getCateId() {
		return this.cateId;
	}

	public void setCateId(Short cateId) {
		this.cateId = cateId;
	}

	public String getCateName() {
		return this.cateName;
	}

	public void setCateName(String cateName) {
		this.cateName = cateName;
	}

	public String getCateDesc() {
		return this.cateDesc;
	}

	public void setCateDesc(String cateDesc) {
		this.cateDesc = cateDesc;
	}

	public Set getProducts() {
		return this.products;
	}

	public void setProducts(Set products) {
		this.products = products;
	}

	public Set getTypes() {
		return this.types;
	}

	public void setTypes(Set types) {
		this.types = types;
	}

}