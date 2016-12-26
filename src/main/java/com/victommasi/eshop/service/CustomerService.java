package com.victommasi.eshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.victommasi.eshop.dao.CustomerDao;
import com.victommasi.eshop.model.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	public void saveCustomer(Customer customer){
		customer.setEnabled(true);
		customer.getAddress().setCustomer(customer);
		customerDao.saveCustomer(customer);
	}
	
	
}
