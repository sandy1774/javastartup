package com.excercise;

public class MobileBill {

	private String customerName;
	private long mobilenumber;
	private String planname;
	private Address address;
	public MobileBill() {
		super();
		
	}
	public MobileBill(String customerName, long mobilenumber, String planname, Address address) {
		super();
		this.customerName = customerName;
		this.mobilenumber = mobilenumber;
		this.planname = planname;
		this.address = address;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getPlanname() {
		return planname;
	}
	public void setPlanname(String planname) {
		this.planname = planname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
