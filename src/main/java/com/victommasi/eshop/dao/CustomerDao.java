package com.victommasi.eshop.dao;

import com.victommasi.eshop.model.Customer;

public interface CustomerDao extends GenericDao<Customer, Integer> {

	void saveCustomer(Customer customer);
}
