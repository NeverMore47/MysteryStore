package com.my.homePage;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.my.entity.Product;

public class HomeDao {

	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	public List<Product> queryFeat() {
		Session session = this.factory.getCurrentSession();
		return session.createQuery("from Product where proIsFeat = 1").list();
	}
	
	public List sqlQuery(String sql) {
		Session session = this.factory.getCurrentSession();
		return session.createSQLQuery(sql).list();
	}
	
	public List hqlQuery(String hql) {
		Session session = this.factory.getCurrentSession();
		Query query = session.createQuery(hql);
		query.setMaxResults(4);
		return query.list();
	}
}
