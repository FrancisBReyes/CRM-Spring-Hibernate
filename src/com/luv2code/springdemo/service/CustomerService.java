package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	@Transactional
	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	@Transactional
	public void deleteCustomer(int theId);

	public List<Customer> searchCustomers(String theSearchName);
}
