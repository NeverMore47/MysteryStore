package com.my.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Product entity. @author MyEclipse Persistence Tools
 */

public class Product implements java.io.Serializable {

	// Fields

	private Short proId;
	private Type type;
	private Category category;
	private Review review;
	private String proBrand;
	private String proName;
	private String proDesc;
	private Double proPrice;
	private Short proDiscount;
	private String proDate;
	private String proSize;
	private Boolean proIsFeat;
	private String proGender;
	private Boolean proIsNew;
	private String proImgSrc;
	private Integer proQuantity;
	private String proColor;
	private Set orderdetailses = new HashSet(0);
	private Set carts = new HashSet(0);
	private Set mains = new HashSet(0);
	private Set wishproductses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Product() {
	}

	/** minimal constructor */
	public Product(Category category, String proBrand, String proName,
			Short proDiscount, Boolean proIsFeat, Boolean proIsNew,
			Integer proQuantity) {
		this.category = category;
		this.proBrand = proBrand;
		this.proName = proName;
		this.proDiscount = proDiscount;
		this.proIsFeat = proIsFeat;
		this.proIsNew = proIsNew;
		this.proQuantity = proQuantity;
	}

	/** full constructor */
	public Product(Type type, Category category, Review review,
			String proBrand, String proName, String proDesc, Double proPrice,
			Short proDiscount, String proDate, String proSize,
			Boolean proIsFeat, String proGender, Boolean proIsNew,
			String proImgSrc, Integer proQuantity, String proColor,
			Set orderdetailses, Set carts, Set mains, Set wishproductses) {
		this.type = type;
		this.category = category;
		this.review = review;
		this.proBrand = proBrand;
		this.proName = proName;
		this.proDesc = proDesc;
		this.proPrice = proPrice;
		this.proDiscount = proDiscount;
		this.proDate = proDate;
		this.proSize = proSize;
		this.proIsFeat = proIsFeat;
		this.proGender = proGender;
		this.proIsNew = proIsNew;
		this.proImgSrc = proImgSrc;
		this.proQuantity = proQuantity;
		this.proColor = proColor;
		this.orderdetailses = orderdetailses;
		this.carts = carts;
		this.mains = mains;
		this.wishproductses = wishproductses;
	}

	// Property accessors

	public Short getProId() {
		return this.proId;
	}

	public void setProId(Short proId) {
		this.proId = proId;
	}

	public Type getType() {
		return this.type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Review getReview() {
		return this.review;
	}

	public void setReview(Review review) {
		this.review = review;
	}

	public String getProBrand() {
		return this.proBrand;
	}

	public void setProBrand(String proBrand) {
		this.proBrand = proBrand;
	}

	public String getProName() {
		return this.proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProDesc() {
		return this.proDesc;
	}

	public void setProDesc(String proDesc) {
		this.proDesc = proDesc;
	}

	public Double getProPrice() {
		return this.proPrice;
	}

	public void setProPrice(Double proPrice) {
		this.proPrice = proPrice;
	}

	public Short getProDiscount() {
		return this.proDiscount;
	}

	public void setProDiscount(Short proDiscount) {
		this.proDiscount = proDiscount;
	}

	public String getProDate() {
		return this.proDate;
	}

	public void setProDate(String proDate) {
		this.proDate = proDate;
	}

	public String getProSize() {
		return this.proSize;
	}

	public void setProSize(String proSize) {
		this.proSize = proSize;
	}

	public Boolean getProIsFeat() {
		return this.proIsFeat;
	}

	public void setProIsFeat(Boolean proIsFeat) {
		this.proIsFeat = proIsFeat;
	}

	public String getProGender() {
		return this.proGender;
	}

	public void setProGender(String proGender) {
		this.proGender = proGender;
	}

	public Boolean getProIsNew() {
		return this.proIsNew;
	}

	public void setProIsNew(Boolean proIsNew) {
		this.proIsNew = proIsNew;
	}

	public String getProImgSrc() {
		return this.proImgSrc;
	}

	public void setProImgSrc(String proImgSrc) {
		this.proImgSrc = proImgSrc;
	}

	public Integer getProQuantity() {
		return this.proQuantity;
	}

	public void setProQuantity(Integer proQuantity) {
		this.proQuantity = proQuantity;
	}

	public String getProColor() {
		return this.proColor;
	}

	public void setProColor(String proColor) {
		this.proColor = proColor;
	}

	public Set getOrderdetailses() {
		return this.orderdetailses;
	}

	public void setOrderdetailses(Set orderdetailses) {
		this.orderdetailses = orderdetailses;
	}

	public Set getCarts() {
		return this.carts;
	}

	public void setCarts(Set carts) {
		this.carts = carts;
	}

	public Set getMains() {
		return this.mains;
	}

	public void setMains(Set mains) {
		this.mains = mains;
	}

	public Set getWishproductses() {
		return this.wishproductses;
	}

	public void setWishproductses(Set wishproductses) {
		this.wishproductses = wishproductses;
	}

}