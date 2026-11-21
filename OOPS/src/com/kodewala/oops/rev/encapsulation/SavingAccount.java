package com.kodewala.oops.rev.encapsulation;

public class SavingAccount extends Account{
	@Override
	public void credit(double amount) {
		System.out.println("SavingAccount.credit()");
	}
}
