package com.my.customer;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.my.entity.Customer;

public class LoginDao {

	private SessionFactory factory;

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	public List testLogin(Customer cust) {
		Session session = factory.getCurrentSession();
		String hql = "from Customer where custName = '" + cust.getCustName()
				+ "' and custPwd = '" + cust.getCustPwd() + "'";
		List list = session.createQuery(hql).list();
		return list;
	}
	
	public List sqlQuery(String sql) {
		Session session = factory.getCurrentSession();
		return session.createSQLQuery(sql).list();
	}
}
