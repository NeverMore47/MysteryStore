package com.my.cart;

import org.apache.struts2.ServletActionContext;

import com.my.entity.Customer;

public class WishListAction {

	private WishListService service;

	public void setService(WishListService service) {
		this.service = service;
	}

	private Short proId;
	private boolean isExist;
	private boolean isSuccess;

	public boolean getIsExist() {
		return isExist;
	}

	public boolean getIsSuccess() {
		return isSuccess;
	}

	public Short getProId() {
		return proId;
	}

	public void setProId(Short proId) {
		this.proId = proId;
	}

	public String addToWishList() {
		Customer cust = (Customer) ServletActionContext.getRequest()
				.getSession().getAttribute("custInfo");
		Short custId = cust.getCustId();
		this.isExist = service.queryExist(custId, this.proId);
		if (isExist) {
			int flag = service.addToWish(custId, proId);
			if (flag > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
		} else {
			return "success";
		}
		return "success";
	}

}
