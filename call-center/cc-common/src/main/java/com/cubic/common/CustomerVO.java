package com.cubic.common;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomerVO {
	private Long pk;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String phone;
	private String email;
	/*private CustomerAddressVO billingAddress;
	private CustomerAddressVO shippingAddress;
	private SecurityQuestionVO securityQuestion;
	*/
	

	public CustomerVO() {
	}
	
	public CustomerVO(String firstName, String lastName, String dateOfBirth, String phone, String email) {
		super();
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.phone = phone;
		this.email = email;
	}
	
	public CustomerVO(Long pk, String firstName, String lastName, String dateOfBirth, String phone, String email) {
		super();
		this.pk = pk;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.phone = phone;
		this.email = email;
	}
	
		
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
	public CustomerAddressVO getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(CustomerAddressVO billingAddress) {
		this.billingAddress = billingAddress;
	}
	public CustomerAddressVO getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(CustomerAddressVO shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public SecurityQuestionVO getSecurityQuestion() {
		return securityQuestion;
	}
	public void setSecurityQuestion(SecurityQuestionVO securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	*/
	@Override
	public String toString() {
		return "CustomerVO [pk=" + pk + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", phone=" + phone + ", email=" + email + "]";
	}
	
	
	

}
