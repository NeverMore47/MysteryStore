package com.my.product;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ProductDao {
	
	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
	public List query(String hql) {
		Session session = factory.getCurrentSession();
		return session.createQuery(hql).list();
	}
	
	public List sqlQuery(String sql) {
		Session session = factory.getCurrentSession();
		return session.createSQLQuery(sql).list();
	}
}
