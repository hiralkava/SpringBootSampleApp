package com.demo.customer.service;

import java.util.List;

import com.demo.customer.dal.entities.Customer;

public interface CustomerService {
	
	public List<Customer> getAllCustomer();
	public Customer getId();

}
