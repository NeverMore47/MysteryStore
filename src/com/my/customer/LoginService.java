package com.my.customer;

import java.math.BigInteger;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.my.entity.Customer;
import com.my.util.SQLFilter;

@Transactional
public class LoginService {

	private LoginDao dao;

	public void setDao(LoginDao dao) {
		this.dao = dao;
	}
	
	public Customer testLogin(Customer cust) {
		List list = dao.testLogin(cust);
		if(list != null) {
			cust = (Customer) list.get(0);
			return cust;
		} else {
			return null;
		}
	}
	
}
