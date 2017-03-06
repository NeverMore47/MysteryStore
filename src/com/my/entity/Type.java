package com.my.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Type entity. @author MyEclipse Persistence Tools
 */

public class Type implements java.io.Serializable {

	// Fields

	private Short typeId;
	private Category category;
	private String typeName;
	private String typeDesc;
	private Set products = new HashSet(0);

	// Constructors

	/** default constructor */
	public Type() {
	}

	/** minimal constructor */
	public Type(Category category, String typeName) {
		this.category = category;
		this.typeName = typeName;
	}

	/** full constructor */
	public Type(Category category, String typeName, String typeDesc,
			Set products) {
		this.category = category;
		this.typeName = typeName;
		this.typeDesc = typeDesc;
		this.products = products;
	}

	// Property accessors

	public Short getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Short typeId) {
		this.typeId = typeId;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getTypeDesc() {
		return this.typeDesc;
	}

	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}

	public Set getProducts() {
		return this.products;
	}

	public void setProducts(Set products) {
		this.products = products;
	}

}