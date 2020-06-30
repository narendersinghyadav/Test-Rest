package com.test.constant;

public class SQLConstantQueries {

	public static final String GET_USER="select * from customer";
	public static final String ADD_USER="insert into customer values(?,?,?,?)";
	public static final String UPDATE_USER="update customer set name=?,password=?,address=? where phonenumber=?";
}
