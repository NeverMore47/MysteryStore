package com.my.cart;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.my.entity.Customer;
import com.my.entity.MyCart;
import com.my.util.ByteToShort;
import com.my.util.SQLFilter;

@Transactional
public class CartService {

	private CartDao dao;

	public void setDao(CartDao dao) {
		this.dao = dao;
	}

	public int queryExist(Short custId, Short proId) {
		String sql = "select * from cart where custId = " + custId
				+ " and proId = " + proId;
		List list = dao.queryExist(sql);
		if (list.size() > 0) {
			Object obj[] = (Object[]) list.get(0);
			byte b = (Byte) obj[2];
			short quantityExist = b;
			Short quantityNew = (short) (quantityExist + 1);
			MyCart cartNew = new MyCart(custId, proId, quantityNew);
			return this.updateCart(cartNew);
		} else {
			MyCart cart = new MyCart(custId, proId, (short) 1);
			return this.insertCart(cart);
		}

	}

	public int updateCart(MyCart cart) {
		String sql = "UPDATE cart set quantity = {quantity} WHERE custID = {custId} AND proID = {proId}";
		sql = SQLFilter.sqlFilter(sql, cart);
		return dao.sqlQuery(sql);
	}

	public int insertCart(MyCart cart) {
		String sql = "insert into cart values ({custId},{proId},1)";
		sql = SQLFilter.sqlFilter(sql, cart);
		return dao.sqlQuery(sql);
	}

	public List queryCart(Short custId) {
		String sql = "SELECT proName,proPrice,proDiscount,quantity,proImgSrc FROM cart c LEFT JOIN product p ON c.proID = p.proID WHERE custID = "
				+ custId;
		List list = dao.sql(sql);
		return list;
	}
	
	public List queryAllCart(Customer cust) {
		String hql = "from Cart where custId = " + cust.getCustId();
		return dao.hqlQuery(hql);
	}

}
