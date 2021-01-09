package com.app.dao;

import org.hibernate.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Customer;

@Repository
public class CustomerDaoImpl implements ICustomerDao {

	@Autowired //byType
	private SessionFactory sf;
	
	@Override
	public String registerCustomer(Customer transientCustomer) {
		String mesg="Customer reg failed";
		sf.getCurrentSession().persist(transientCustomer);
		mesg="Customer reg successful , ID : "+transientCustomer.getId();
		return mesg;
	}

	@Override
	public Customer authenticateCustomer(String email1, String pwd1) {
		String jpql="select c from Customer c where c.email =:em and c.password=:pa";
		
		return sf.getCurrentSession().createQuery(jpql, Customer.class).setParameter("em", email1).
				setParameter("pa", pwd1).getSingleResult();

	}

}
