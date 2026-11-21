package com.kodewala.oops.inheritance.hi.cw1;

public class SavingAccount extends BankAccount {

	public SavingAccount(String _accountNumber) {
		super(_accountNumber);
	}
	public void displayIR() {
		displayBank();
		System.out.println(6.5 + "%");
	}
	
}
