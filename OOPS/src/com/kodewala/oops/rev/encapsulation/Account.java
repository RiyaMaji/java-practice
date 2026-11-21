package com.kodewala.oops.rev.encapsulation;

public class Account {
	private int balance;
	public final int MAX_TXN_AMT_IN_24_HRS=100000;
	//this method will modify the balance
	//final 
	public void credit(double amount) {
		//check the balance of sender
		checkBalance();
		//check the pin of sender
		validatePin("4562da");
		//debit the amount
		//credit the amount --> 0 -->100
		System.out.println("Account.credit()...doing fund transfer..");
	
	}
	private int checkBalance() {
		System.out.println("Account.checkBalance()");
		return balance;
	}
	private boolean validatePin(String userID) {
		System.out.println("Account.validatePin()");
		return true;
	}
}
class AccounmtMgmt extends Account {
	// this method will modify the balance
	@Override
	public void credit(double amount) {
	System.out.println("AccounmtMgmt.credit() .... ");
	}
}
