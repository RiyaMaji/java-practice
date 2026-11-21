package com.kodewala.oops.overriding;

public class Account {
	int minBalance = 1000;
	public void openAccount(String name,int initBala) {
		System.out.println("Account.openAccount()");
	}
	public static void displayDetails() {
		System.out.println("Account.displayDetails()");
	}

}
class SavingAccount extends Account{
	int minBalance = 2000;
	/*
	 * Method name should be same. 
	   Arguments should be same (order of args,number of args, type of args) 
	   Return type should be same except covariant. 
	   Access Modifier --> should be same or widened(public ->public,Protected -> protected or public ) 
	 */
	@Override  //you are telling compiler that i m overriding the method, pls check all the rules.
	public void openAccount(String _name,int _initBal) {

		super.openAccount(_name,_initBal);
		System.out.println("SavingAccount.openAccount()");
	}
//	@Override
//	public void displayDetails() {
//		System.out.println("SavingAccount.displayDetails()");
//	}
}
