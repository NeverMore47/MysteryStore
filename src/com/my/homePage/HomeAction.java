package com.my.homePage;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.my.entity.Customer;
import com.my.entity.Product;

public class HomeAction {

	private HomeService service;

	public void setService(HomeService service) {
		this.service = service;
	}

	/* 查询首页特色商品开始 */
	private List<Product> listFeat;

	public List<Product> getListFeat() {
		return listFeat;
	}

	public void setListFeat(List<Product> listFeat) {
		this.listFeat = listFeat;
	}

	public String queryFeat() {
		this.listFeat = this.service.queryFeat();
		this.queryGenderNum();
		this.queryNew();
		this.queryCount();
		return "success";
	}

	/* 查询首页特色商品结束 */

	/* 查询大类数量开始 */
	private int menNum;
	private int womenNum;
	private int childNum;

	public int getWomenNum() {
		return womenNum;
	}

	public int getChildNum() {
		return childNum;
	}

	public int getMenNum() {
		return menNum;
	}

	public void queryGenderNum() {
		this.menNum = service.queryGenderNum("男");
		this.womenNum = service.queryGenderNum("女");
		this.childNum = service.queryGenderNum("儿童");
	}
	/* 查询大类数量结束 */
	
	/*查询最新上架 ------------begin*/
	private List productNewList;

	public List getProductNewList() {
		return productNewList;
	}
	
	public void queryNew() {
		this.productNewList = service.queryNew();
		
	}
	/*查询最新上架 -----------end*/
	
	/*查询心愿单、购物车数量------begin*/
	private int cartNum;
	
	public int getCartNum() {
		return cartNum;
	}

	public String queryCount() {
		Customer cust = (Customer) ServletActionContext.getRequest()
				.getSession().getAttribute("custInfo");
		if(cust != null) {
			this.cartNum = service.queryCartCount(cust);
			int wishNum = service.queryWishConut(cust);
			ServletActionContext.getRequest().getSession().setAttribute("cartNum", cartNum);
			ServletActionContext.getRequest().getSession().setAttribute("wishNum", wishNum);
		}
		return "success";
	}
	/*查询心愿单、购物车数量------end*/
	
	
	
	
	
	
}
