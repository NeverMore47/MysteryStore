package com.my.cart;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.my.entity.Cart;
import com.my.entity.CartId;

public class CartDao {

	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
	public List queryExist(String sql) {
		Session session=null;
		try {
			session = this.factory.getCurrentSession();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		List list = session.createSQLQuery(sql).list();
		return list;
	}
	
	public int sqlQuery(String sql) {
		Session session = this.factory.getCurrentSession();
		int flag = session.createSQLQuery(sql).executeUpdate();
		return flag;
	}
	
	public List sql(String sql) {
		Session session = this.factory.getCurrentSession();
		return session.createSQLQuery(sql).list();
	}
	
	public List hqlQuery(String hql) {
		Session session = this.factory.getCurrentSession();
		return session.createQuery(hql).list();
	}
	
	public List sqlSelect(String sql) {
		Session session = this.factory.getCurrentSession();
		return session.createSQLQuery(sql).list();
		
	}
}
