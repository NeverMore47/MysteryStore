package com.my.homePage;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.my.entity.Customer;
import com.my.entity.Product;

@Transactional
public class HomeService {

	private HomeDao dao;

	public void setDao(HomeDao dao) {
		this.dao = dao;
	}
	
	public List<Product> queryFeat() {
		return dao.queryFeat();
	}
	
	public int queryGenderNum(String gender) {
		String sql = "SELECT COUNT(proGender) FROM product WHERE proGender = '"+ gender +"'";
		List list = dao.sqlQuery(sql);
		BigInteger bi = (BigInteger) list.get(0);
		int i = bi.intValue();
		return i;
	}
	
	public int queryWishConut(Customer cust) {
		String sql = "SELECT COUNT(*) from wishproducts WHERE wlID = (SELECT wlID from wishlist WHERE custID = "+ cust.getCustId() +")";
		List list = dao.sqlQuery(sql);
		return ((BigInteger)list.get(0)).intValue();
	}
	
	public int queryCartCount(Customer cust) {
		String sql = "SELECT COUNT(proID) FROM cart WHERE custID = " + cust.getCustId();
		List list = dao.sqlQuery(sql);
		return ((BigInteger)list.get(0)).intValue();
	}
	
	public List queryNew() {
		String hql = "FROM Product WHERE proIsNew = 1 ORDER BY proDate DESC";
		return dao.hqlQuery(hql);
	} 
}
