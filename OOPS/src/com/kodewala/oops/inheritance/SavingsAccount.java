package com.kodewala.oops.inheritance;

public class SavingsAccount extends Account{
	
	public void openSavingAccount(String name , String address, String type) {
		//reusing the existing functionality
		openBankAccount(name, address, type);
		System.out.println("Thanks for opening Account with us !!!");
	}
}
