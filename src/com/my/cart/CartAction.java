package com.my.cart;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.my.entity.Customer;

public class CartAction {

	private CartService service;

	public void setService(CartService service) {
		this.service = service;
	}

	private Short proId;
	private boolean isSuccess;

	public boolean getIsSuccess() {
		return isSuccess;
	}

	public Short getProId() {
		return proId;
	}

	public void setProId(Short proId) {
		this.proId = proId;
	}

	public String addToCart() {
		Customer cust = (Customer) ServletActionContext.getRequest()
				.getSession().getAttribute("custInfo");
		Short custId = cust.getCustId();
		int flag = service.queryExist(custId, this.proId);
		if (flag > 0) {
			this.isSuccess = true;
		} else {
			this.isSuccess = false;
		}
		return "success";
	}

	private List listcart;

	public List getListcart() {
		return listcart;
	}

	public void setListcart(List listcart) {
		this.listcart = listcart;
	}

	public String showCart() {
		Customer cust = (Customer) ServletActionContext.getRequest()
				.getSession().getAttribute("custInfo");
		if(cust != null) {
			Short custId = cust.getCustId();
			this.listcart = service.queryCart(custId);
		}
		return "success";
	}
	
	private List listCartDetails;
	
	public List getListCartDetails() {
		return listCartDetails;
	}

	public String toCart() {
		Customer cust = (Customer) ServletActionContext.getRequest()
				.getSession().getAttribute("custInfo");
		this.listCartDetails = service.queryAllCart(cust); 
		return "success";
	}
}
