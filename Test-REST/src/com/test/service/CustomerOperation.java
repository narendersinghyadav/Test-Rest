package com.test.service;

import java.util.List;

import com.test.dao.CustomerDao;
import com.test.model.Customer;

public class CustomerOperation {
	
	CustomerDao customerdao=new CustomerDao();
	
	public List<Customer> listCustomer(){
		return customerdao.getCustomer();
	}
	
	public void addCustomer(Customer customer) {
		customerdao.addCustomer(customer);
	}
	
	public void updateCustomer(Customer customer) {
		customerdao.updateCustomer(customer);
	}

}
