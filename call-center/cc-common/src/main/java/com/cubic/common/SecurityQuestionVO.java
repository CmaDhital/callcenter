package com.cubic.common;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SecurityQuestionVO {
	private Long securityQuestionId;
	private String firstQuest;
	private String firstAns;
	private String secondQuest;
	private String secondAns;
	private String thirdQuest;
	private String thirdAns;
	private CustomerVO customer;
	
	public Long getSecurityQuestionId() {
		return securityQuestionId;
	}
	public void setSecurityQuestionId(Long securityQuestionId) {
		this.securityQuestionId = securityQuestionId;
	}
	public String getFirstQuest() {
		return firstQuest;
	}
	public void setFirstQuest(String firstQuest) {
		this.firstQuest = firstQuest;
	}
	public String getFirstAns() {
		return firstAns;
	}
	public void setFirstAns(String firstAns) {
		this.firstAns = firstAns;
	}
	public String getSecondQuest() {
		return secondQuest;
	}
	public void setSecondQuest(String secondQuest) {
		this.secondQuest = secondQuest;
	}
	public String getSecondAns() {
		return secondAns;
	}
	public void setSecondAns(String secondAns) {
		this.secondAns = secondAns;
	}
	public String getThirdQuest() {
		return thirdQuest;
	}
	public void setThirdQuest(String thirdQuest) {
		this.thirdQuest = thirdQuest;
	}
	public String getThirdAns() {
		return thirdAns;
	}
	public void setThirdAns(String thirdAns) {
		this.thirdAns = thirdAns;
	}
	
	public CustomerVO getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerVO customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "SecurityQuestionVO [securityQuestionId=" + securityQuestionId + ", firstQuest=" + firstQuest
				+ ", firstAns=" + firstAns + ", secondQuest=" + secondQuest + ", secondAns=" + secondAns
				+ ", thirdQuest=" + thirdQuest + ", thirdAns=" + thirdAns + "]";
	}
	public SecurityQuestionVO() {
	}
	
	public SecurityQuestionVO(Long securityQuestionId, String firstQuest, String firstAns, String secondQuest,
			String secondAns, String thirdQuest, String thirdAns) {
		super();
		this.securityQuestionId = securityQuestionId;
		this.firstQuest = firstQuest;
		this.firstAns = firstAns;
		this.secondQuest = secondQuest;
		this.secondAns = secondAns;
		this.thirdQuest = thirdQuest;
		this.thirdAns = thirdAns;
	}
	
	
	
	

}
