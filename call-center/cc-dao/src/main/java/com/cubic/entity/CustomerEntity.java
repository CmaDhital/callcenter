package com.cubic.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="CUSTOMER")
public class CustomerEntity {
	
	
	@Id
	@Column(name="CUST_ID")
	@SequenceGenerator(name = "cust_seq", sequenceName = "CUST_SEQ", allocationSize = 1)
	@GeneratedValue(generator="cust_seq")
	private Long pk;
	
	@Column(name="CUST_FIRST_NAME")
	private String firstName;
	
	@Column(name="CUST_LAST_NAME")
	private String lastName;
	
	
	
	@Column(name="CUST_PHONE")
	private String phone;
	
	@Column(name="CUST_EMAIL")
	private String email;
	
	@Column(name="CUST_DOB")
	private String dateOfBirth;
	/*
	@OneToOne(fetch=FetchType.LAZY, cascade= CascadeType.ALL, mappedBy="customer")
	private BillingAddressEntity billingaddr;
	
	@OneToMany(fetch=FetchType.LAZY,cascade= CascadeType.ALL , mappedBy="customer")	
	private List<ShippingAddressEntity> shippingList;
	
	@OneToOne(fetch=FetchType.LAZY, cascade= CascadeType.ALL, mappedBy="customer")
	private SecurityQuestionEntity securityqn;
		*/
	
	public Long getPk() {
		return pk;
	}
	public void setPk(Long pk) {
		this.pk = pk;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		
	
	/*
	public BillingAddressEntity getBillingaddr() {
		
		return billingaddr;
	}
	public void setBillingaddr(BillingAddressEntity billingaddr) {
		this.billingaddr = billingaddr;
	}
	public List<ShippingAddressEntity> getShippingList() {
		if(shippingList==null)
		{
			shippingList= new ArrayList<ShippingAddressEntity>();
		}
		return shippingList;
		
	}
	public void setShippingList(List<ShippingAddressEntity> shippingList) {
		this.shippingList = shippingList;
	}
	public SecurityQuestionEntity getSecurityqn() {
		return securityqn;
	}
	public void setSecurityqn(SecurityQuestionEntity securityqn) {
		this.securityqn = securityqn;
	}
	
	*/
	public CustomerEntity() {
	}
	
	
	
	public CustomerEntity(String firstName, String lastName, String phone, String email, String dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
	}
	public CustomerEntity(Long pk, String firstName, String lastName, String phone, String email, String dateOfBirth) {
		super();
		this.pk = pk;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "CustomerVO [pk=" + pk + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", phone=" + phone + ", email=" + email + "]";
	}
	
	
	

}
