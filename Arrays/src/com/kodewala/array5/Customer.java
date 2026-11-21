package com.kodewala.array5;

public class Customer {
	private String customerName;
	private double accountBalance;
	private String mobileNumber;
	public Customer(String customerName, double accountBalance, String mobileNumber) {
		super();
		this.customerName = customerName;
		this.accountBalance = accountBalance;
		this.mobileNumber = mobileNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
}
