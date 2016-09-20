package com.cubic.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="CUST_SHIPPING_ADDRESS")
public class ShippingAddressEntity {
	
	@Id
	@Column(name="CUST_SHIPPING_ID")
	@SequenceGenerator(name = "shipping-seq", sequenceName = "CUST_SHIPPING_SEQ", allocationSize = 1)
	@GeneratedValue(generator="shipping-seq")
	private Long shippingId;
	
	@Column(name="CUST_SHIPPING_STREET")
	private String street;
	
	@Column(name="CUST_SHIPPING_CITY")
	private String city;
	
	@Column(name="CUST_SHIPPING_STATE")
	private String state;
	
	@Column(name="CUST_SHIPPING_ZIP")
	private int zipCode;
	
	@Column(name="CUST_SHIPPING_COUNTRY")
	private String country;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade= CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private CustomerEntity customer;
	
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
	
	public CustomerEntity getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "ShippingAddressVO [shippingId=" + shippingId + ", street=" + street + ", city=" + city + ", state="
				+ state + ", zipCode=" + zipCode + ", country=" + country + "]";
	}
	public ShippingAddressEntity(String street, String city, String state, int zipCode, String country) {
		super();
		
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.country = country;
	}

	public ShippingAddressEntity() {
	}
	
	

}
