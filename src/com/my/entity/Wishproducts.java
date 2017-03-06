package com.my.entity;

/**
 * Wishproducts entity. @author MyEclipse Persistence Tools
 */

public class Wishproducts implements java.io.Serializable {

	// Fields

	private WishproductsId id;
	private Wishlist wishlist;
	private Product product;

	// Constructors

	/** default constructor */
	public Wishproducts() {
	}

	/** full constructor */
	public Wishproducts(WishproductsId id, Wishlist wishlist, Product product) {
		this.id = id;
		this.wishlist = wishlist;
		this.product = product;
	}

	// Property accessors

	public WishproductsId getId() {
		return this.id;
	}

	public void setId(WishproductsId id) {
		this.id = id;
	}

	public Wishlist getWishlist() {
		return this.wishlist;
	}

	public void setWishlist(Wishlist wishlist) {
		this.wishlist = wishlist;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}