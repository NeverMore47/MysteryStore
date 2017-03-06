package com.my.entity;

/**
 * Main entity. @author MyEclipse Persistence Tools
 */

public class Main implements java.io.Serializable {

	// Fields

	private Short mainId;
	private Product product;
	private String mainTitle;
	private String mainDesc;
	private String mainImgSrc;

	// Constructors

	/** default constructor */
	public Main() {
	}

	/** minimal constructor */
	public Main(Product product, String mainTitle, String mainImgSrc) {
		this.product = product;
		this.mainTitle = mainTitle;
		this.mainImgSrc = mainImgSrc;
	}

	/** full constructor */
	public Main(Product product, String mainTitle, String mainDesc,
			String mainImgSrc) {
		this.product = product;
		this.mainTitle = mainTitle;
		this.mainDesc = mainDesc;
		this.mainImgSrc = mainImgSrc;
	}

	// Property accessors

	public Short getMainId() {
		return this.mainId;
	}

	public void setMainId(Short mainId) {
		this.mainId = mainId;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getMainTitle() {
		return this.mainTitle;
	}

	public void setMainTitle(String mainTitle) {
		this.mainTitle = mainTitle;
	}

	public String getMainDesc() {
		return this.mainDesc;
	}

	public void setMainDesc(String mainDesc) {
		this.mainDesc = mainDesc;
	}

	public String getMainImgSrc() {
		return this.mainImgSrc;
	}

	public void setMainImgSrc(String mainImgSrc) {
		this.mainImgSrc = mainImgSrc;
	}

}