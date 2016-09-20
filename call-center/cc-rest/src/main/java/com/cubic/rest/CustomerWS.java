package com.cubic.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cubic.common.CustomerVO;
import com.cubic.service.CustomerService;

@Service
@Path ("/customer")
public class CustomerWS {
	private final static Logger logger = LoggerFactory.getLogger(CustomerWS.class);

	@Autowired
	private CustomerService customerService;
	
	@POST
	@Path("/register")
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	public Response createCustomers(final CustomerVO customer){
		logger.debug("Customer VO ={}", customer);
	//CustomerVO result = customerService.registerCustomer(customer);
		ResponseBuilder rb = Response.ok().type(MediaType.APPLICATION_JSON).entity("register");
		return rb.build();
		
	}
	
	@GET
	@Path("/hello")
	@Produces({MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_JSON})
	public Response sayHello(){
		//return "Hello";
		ResponseBuilder rb = Response.ok().type(MediaType.APPLICATION_JSON).entity("Hello");
		return rb.build();
		
	}
}
