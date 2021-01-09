package com.app.dao;

import com.app.pojos.Customer;

public interface ICustomerDao {
	String registerCustomer(Customer transientCustomer);
	Customer authenticateCustomer(String email,String pwd);
}
