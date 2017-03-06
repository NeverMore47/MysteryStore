package com.my.product;

import com.my.entity.Product;

public class ProductAction {

	private ProductService service;

	public void setService(ProductService service) {
		this.service = service;
	}

	private Short proId;
	private Product pro;

	public Product getPro() {
		return pro;
	}

	public void setPro(Product pro) {
		this.pro = pro;
	}

	public Short getProId() {
		return proId;
	}

	public void setProId(Short proId) {
		this.proId = proId;
	}

	public String queryOne() {
		this.pro = service.queryOne(this.proId);
		this.queryDiscount();
		this.queryReview();
		return "success";
	}

	private Double currentPrice;

	public Double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(Double currentPrice) {
		currentPrice = currentPrice;
	}

	public void queryDiscount() {
		Product product = service.queryOne(this.proId);
		double discount = product.getProDiscount();
		this.currentPrice = product.getProPrice() * (discount / 10);
	}
	
	private int reviewNum;

	public int getReviewNum() {
		return reviewNum;
	}
	
	public void queryReview() {
		this.reviewNum = service.sqlQuery(this.proId);
	}
}
