package com.demo.customer.dal.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.customer.dal.entities.Customer;

public interface CustomerRepos extends JpaRepository<Customer, Long>{

}
