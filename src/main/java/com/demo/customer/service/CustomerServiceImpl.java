package com.demo.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.customer.dal.entities.Customer;
import com.demo.customer.dal.repos.CustomerRepos;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepos customerRepos;
	
	@Override
	public List<Customer> getAllCustomer() {
		return customerRepos.findAll();
	}

}
