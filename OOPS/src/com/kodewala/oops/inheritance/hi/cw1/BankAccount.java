package com.kodewala.oops.inheritance.hi.cw1;

public class BankAccount {
	private String accountNumber;
	
	public BankAccount(String _accountNumber) {
		super();
		accountNumber = _accountNumber;
	}

	public void displayBank() {
		System.out.println(accountNumber);
	}
}
