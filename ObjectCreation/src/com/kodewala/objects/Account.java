package com.kodewala.objects;
class AccountMgmt{
	public AccountMgmt() {
		System.out.println("AccountMgmt.AccountMgmt()");
	}
}
public class Account extends AccountMgmt{
//	static {
//		System.out.println("Account.SIB()");
//	}
	String accountNumber;
	
	public Account(String accountNumber) {
		super();  //1st Line
		//call to init block --> IIB ---> 2nd Line
		System.out.println("Account.Account()"+ accountNumber);
		this.accountNumber = accountNumber;
	}
	{
		//Instance Init Block --> this will get executed whenever object is created
		System.out.println("Account IIB ");
	}
}
