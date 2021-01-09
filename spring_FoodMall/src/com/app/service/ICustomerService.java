package com.app.service;

import com.app.pojos.Customer;

public interface ICustomerService {
Customer  authenticateUser(String email,String pwd);
}
