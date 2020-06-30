package com.test.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.test.model.Customer;
import com.test.service.CustomerOperation;

@Path("/customer")
public class CustomerRestController {
	
	private static Logger  logger=Logger.getLogger(CustomerRestController.class);
	CustomerOperation customeroperation=new CustomerOperation();
	
	@GET
	@Path("/listcustomer")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Customer> getCustomer(){
		logger.info("list of customer ");
		return customeroperation.listCustomer();
	}
	
	@POST
	@Path("/addcustomer")
	@Consumes("application/json")
	public Response createCustomer(Customer customer) {
		logger.info("adding customer");
		customeroperation.addCustomer(customer);
		return Response.status(201).entity("customer created").build();
	}
	
	@PUT
	@Path("/updatecustomer")
	@Consumes("application/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer updateCustomer(Customer customer) {
		logger.info("updating customer");
		customeroperation.updateCustomer(customer);
		return customer;
		
	}
}
