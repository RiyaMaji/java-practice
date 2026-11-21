package com.kodewala.marker.p1;

import java.io.Serializable;

public class BankAccount implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String accountNumber;
	private String accountHolderName;
	private double balance;
	public BankAccount(String accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public double getBalance() {
		return balance;
	}

}
