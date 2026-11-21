package com.kodewala.oops.rev.encapsulation;

public class Driver {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.credit(12000);
		//acc.balance =12000;
		SavingAccount sA = new SavingAccount();
		sA.credit(120000);
	}
	
}
