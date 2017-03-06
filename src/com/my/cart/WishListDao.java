package com.my.cart;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class WishListDao {

	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
	public List queryExist(String sql) {
		Session session = this.factory.getCurrentSession();
		List list = null;
		try {
			list = session.createSQLQuery(sql).list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	 
	public int insertWishList(String sql) {
		Session session = this.factory.getCurrentSession();
		int flag = session.createSQLQuery(sql).executeUpdate();
		return flag;
	}
}
