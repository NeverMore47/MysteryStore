package com.my.product;

import java.math.BigInteger;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.my.entity.Product;

@Transactional
public class ProductService {

	private ProductDao dao;

	public void setDao(ProductDao dao) {
		this.dao = dao;
	}

	public Product queryOne(Short proId) {
		String hql = "from Product where proId = " + proId;
		return (Product) dao.query(hql).get(0);
	}
	
	public int sqlQuery(Short proId) {
		String sql = "SELECT COUNT(*) FROM review WHERE reID = (SELECT reID FROM product WHERE proID = "+ proId +")";
		List list = dao.sqlQuery(sql);
		BigInteger bi = (BigInteger) list.get(0);
		int i = bi.intValue();
		return i;
	}
}
