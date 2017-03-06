package com.my.productFilter;

import java.util.List;

import com.my.entity.Product;

public class FilterAction {

	private FilterService service;

	public void setService(FilterService service) {
		this.service = service;
	}

	private List listBrands;
	private List listCategories;
	private List listColor;

	public List getListColor() {
		return listColor;
	}

	public List getListCategories() {
		return listCategories;
	}

	public List getListBrands() {
		return listBrands;
	}

	public String queryFilter() {
		this.listBrands = service.queryBrand();
		this.listCategories = service.queryCategory();
		this.listColor = service.queryColor();
		return "success";
	}

	private String proBrand;
	private String proCate;
	private List listPro;
	
	public void setProCate(String proCate) {
		this.proCate = proCate;
	}

	public void setProBrand(String proBrand) {
		this.proBrand = proBrand;
	}

	public List getListPro() {
		return listPro;
	}
	
	public void setListPro(List listPro) {
		this.listPro = listPro;
	}

	public String queryProList() {
		this.listPro = service.queryProduct(this.proBrand,this.proCate);
		return "proList";
	}

}
