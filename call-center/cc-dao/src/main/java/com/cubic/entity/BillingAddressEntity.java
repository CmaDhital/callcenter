package com.cubic.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


@Entity
@Table(name="CUST_BILLING_ADDRESS")
public class BillingAddressEntity {
	
	@Id
	@Column(name="CUST_BILLING_ID")
	@GenericGenerator(name="billing_id", strategy= "foreign", parameters=@Parameter(name="property", value="customer"))
	@GeneratedValue(generator="billing_id")
	private Long billingId;
	
	@Column(name="CUST_BILLING_STREET")
	private String street;
	
	@Column(name="CUST_BILLING_CITY")
	private String city;
	
	@Column(name="CUST_BILLING_STATE")
	private String state;
	
	@Column(name="CUST_BILLING_ZIP")
	private int zipCode;
	
	@Column(name="CUST_BILLING_COUNTRY")
	private String country;
	
	@OneToOne(fetch=FetchType.LAZY, cascade= CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private CustomerEntity customer;
	
	public Long getBillingId() {
		return billingId;
	}
	public void setBillingId(Long billingId) {
		this.billingId = billingId;
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
	public BillingAddressEntity() {
		super();
	}
	
	public BillingAddressEntity(String street, String city, String state, int zipCode, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.country = country;
	}
	@Override
	public String toString() {
		return "BillingAddressVO [billingId=" + billingId + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", zipCode=" + zipCode + ", country=" + country + "]";
	}
	
	


}
