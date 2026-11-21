package com.kodewala.oops.inheritance3;
class Account{
	public void openAccount(String userId) //x-->x+1
	{
		System.out.println("Account.openAccount()");
	}
}
class SavingAccount extends Account{
	@Override //changing the super class method's functionalities
	public void openAccount(String userId) {
		System.out.println("SavingAccount.openAccount()");
	}
}
class SrCitAccount extends SavingAccount{
	public void openAccount() {
		System.out.println("SrCitAccount.openAccount()");
	}
}
class PensionAccount extends SrCitAccount{
	public void openAccount(String userI) 
	{
		System.out.println("PensionAccount.openAccount()");
	}
}
public class Driver {

	public static void main(String[] args) {
		PensionAccount pa = new PensionAccount();
		pa.openAccount();

	}

}
