package com.kodewala.oops.overriding;

public class Driver {

	public static void main(String[] args) {
		SavingAccount savingAccount = new SavingAccount();
		savingAccount.openAccount("Riya", 1200000);
		//savingAccount.displayDetails();
		Account.displayDetails();
	}

}
