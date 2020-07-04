package com.kishor.service;

import java.util.List;

import com.kishor.entity.Customer;

public interface CustomerService {

	public List<Customer> getCostumers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int customerId);

	public void deleteCustomer(int customerId);

	public List<Customer> searchCustomers(String theSearchName);
}
