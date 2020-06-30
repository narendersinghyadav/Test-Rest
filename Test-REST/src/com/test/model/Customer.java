package com.test.model;

public class Customer {

	private int phonenumber;
	private String name;
	private String password;
	private String address;
	
	
	public Customer(int phonenumber, String name, String password, String address) {
		super();
		this.phonenumber = phonenumber;
		this.name = name;
		this.password = password;
		this.address = address;
	}
	public Customer() {
		
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


}
