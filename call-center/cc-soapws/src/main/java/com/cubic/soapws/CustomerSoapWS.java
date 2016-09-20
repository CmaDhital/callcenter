package com.cubic.soapws;

import javax.jws.WebService;


import com.cubic.soap.service.CustomerServicePortType;
import com.cubic.soap.service.CustomerServiceRequestType;
import com.cubic.soap.service.CustomerServiceResponseType;
import com.cubic.soap.service.CustomerType;

@WebService(serviceName="CustomerService",targetNamespace="http://com.cubic.net/customerservice/1.0",
portName="CustomerServicePort",wsdlLocation="WEB-INF/wsdl/CustomerService.wsdl", endpointInterface="com.cubic.soap.service.CustomerServicePortType")
public class CustomerSoapWS implements CustomerServicePortType{
	
	@Override
	public CustomerServiceResponseType searchCustomer(CustomerServiceRequestType request) {
		CustomerServiceResponseType resp = new CustomerServiceResponseType();
		resp.getCustomerType().add(createCustomer("Jim","Smith"));
		resp.getCustomerType().add(createCustomer("Marc","Woods"));
		return resp;
	}

	private CustomerType createCustomer(final String fiestName, final String lastName) {
		CustomerType customer = new CustomerType();
		customer.setFirstName(fiestName);
		customer.setLastName(lastName);
		return customer;
	}

}