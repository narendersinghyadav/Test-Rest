package com.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.test.constant.SQLConstantQueries;
import com.test.model.Customer;
import com.test.utils.DBUtil;

public class CustomerDao {

	public static Logger logger=Logger.getLogger(CustomerDao.class);
	Connection connection=null;

	public List<Customer> getCustomer(){
		connection=DBUtil.getConnection();
		List<Customer> customerlist=new ArrayList<Customer>();
		try {
			PreparedStatement statement=connection.prepareStatement(SQLConstantQueries.GET_USER);
			ResultSet resultset=statement.executeQuery();
			while(resultset.next()) {
				customerlist.add(new Customer(resultset.getInt("phonenumber"),resultset.getString("name"),resultset.getString("password"),resultset.getString("address")));
			}

		} catch (SQLException e) {
			logger.error(e.getMessage());
		}
		return customerlist;

	}
	
	
	public void addCustomer(Customer customer) {
		connection=DBUtil.getConnection();
		
		try {
			PreparedStatement statement=connection.prepareStatement(SQLConstantQueries.ADD_USER);
			statement.setInt(1, customer.getPhonenumber());
			statement.setString(2, customer.getName());
			statement.setString(3,customer.getPassword());
			statement.setString(4, customer.getAddress());
			
			statement.executeUpdate();
			
		} catch (SQLException e) {
			logger.error(e.getMessage());
		}
	}
	
	public void updateCustomer(Customer customer) {
		connection=DBUtil.getConnection();
		
		try {
			PreparedStatement statement=connection.prepareStatement(SQLConstantQueries.UPDATE_USER);
			statement.setInt(4, customer.getPhonenumber());
			statement.setString(1, customer.getName());
			statement.setString(2,customer.getPassword());
			statement.setString(3, customer.getAddress());
			
			statement.executeUpdate();
			
		} catch (SQLException e) {
			logger.error(e.getMessage());
		}
	}
}
