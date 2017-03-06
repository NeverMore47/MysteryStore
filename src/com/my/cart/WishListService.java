package com.my.cart;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public class WishListService {

	private WishListDao dao;

	public void setDao(WishListDao dao) {
		this.dao = dao;
	}
	
	public boolean queryExist(Short custID,Short proID) {
		String sql = "SELECT proID FROM wishlist wl RIGHT JOIN wishproducts wp ON wl.wlID = wp.wlID WHERE custID = "+ custID +" AND proID = " + proID;
		List list = dao.queryExist(sql);
		if(list.size() > 0) {
			return false;
		}
		return true;
	}
	
	public int addToWish(Short custID,Short proID) {
		String sql = "INSERT INTO wishproducts VALUES ((SELECT wlID FROM wishlist WHERE custID = "+ custID +"),"+ proID +")";
		return dao.insertWishList(sql);
	}
	
}
