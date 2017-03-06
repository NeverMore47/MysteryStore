package com.my.productFilter;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.transform.Transformers;

import com.my.entity.Product;

public class FilterDao {

	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
	
	public List hqlQuery(String hql) {
		Session session = factory.getCurrentSession();
		return session.createQuery(hql).list();
	}
	
	public int hqlUpdate(String hql) {
		Session session = factory.getCurrentSession();
		return session.createQuery(hql).executeUpdate();
	}
	
	public List sqlQuery(String sql) {
		Session session = factory.getCurrentSession();
		return session.createSQLQuery(sql).list();
	}
	
	public int sqlUpdate(String sql) {
		Session session = factory.getCurrentSession();
		return session.createSQLQuery(sql).executeUpdate();
	}
}
