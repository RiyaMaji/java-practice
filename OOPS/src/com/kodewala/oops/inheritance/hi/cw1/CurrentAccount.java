package com.kodewala.oops.inheritance.hi.cw1;

public class CurrentAccount extends BankAccount{

	public CurrentAccount(String _accountNumber) {
		super(_accountNumber);
	}
	public void displayCR() {
		displayBank();
		System.out.println("OverDraft");
	}

}
