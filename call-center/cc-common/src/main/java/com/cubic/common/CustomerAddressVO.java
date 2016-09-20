package com.cubic.common;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomerAddressVO {
	
	private Long shippingId;
	private String street;
	private String city;
	private String state;
	private int zipCode;
	private String country;
	private CustomerVO customer;
	
	public Long getShippingId() {
		return shippingId;
	}
	public void setShippingId(Long shippingId) {
		this.shippingId = shippingId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public CustomerVO getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerVO customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "ShippingAddressVO [shippingId=" + shippingId + ", street=" + street + ", city=" + city + ", state="
				+ state + ", zipCode=" + zipCode + ", country=" + country + "]";
	}
	public CustomerAddressVO(Long shippingId, String street, String city, String state, int zipCode, String country) {
		super();
		this.shippingId = shippingId;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.country = country;
	}
	public CustomerAddressVO() {
	}
	
	
}
