package com.my.entity;

/**
 * WishproductsId entity. @author MyEclipse Persistence Tools
 */

public class WishproductsId implements java.io.Serializable {

	// Fields

	private Wishlist wishlist;
	private Product product;

	// Constructors

	/** default constructor */
	public WishproductsId() {
	}

	/** full constructor */
	public WishproductsId(Wishlist wishlist, Product product) {
		this.wishlist = wishlist;
		this.product = product;
	}

	// Property accessors

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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof WishproductsId))
			return false;
		WishproductsId castOther = (WishproductsId) other;

		return ((this.getWishlist() == castOther.getWishlist()) || (this
				.getWishlist() != null && castOther.getWishlist() != null && this
				.getWishlist().equals(castOther.getWishlist())))
				&& ((this.getProduct() == castOther.getProduct()) || (this
						.getProduct() != null && castOther.getProduct() != null && this
						.getProduct().equals(castOther.getProduct())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getWishlist() == null ? 0 : this.getWishlist().hashCode());
		result = 37 * result
				+ (getProduct() == null ? 0 : this.getProduct().hashCode());
		return result;
	}

}