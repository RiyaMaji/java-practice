package com.kodewala.sbi;

public class Customer {
	String customerName ;
	double accountBalance ; 
	String mobileNumber;
	public Customer(String _customerName, double _accountBalance, String _mobileNumber) {
		super();
		this.customerName = _customerName;
		this.accountBalance = _accountBalance;
		this.mobileNumber = _mobileNumber;
	}
	public String checkBalance(double balance) {
		if(balance < 2000)
			return this.customerName;
		else
			return "Balance Maintained";
		
	}
}
