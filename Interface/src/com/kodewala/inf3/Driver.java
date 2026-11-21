package com.kodewala.inf3;

public class Driver {

	public static void main(String[] args) {
		
		IAccountMgmt accountData = () -> {
			System.out.println("AccountInfo...");
		};
		accountData.accountDetails();
		
		
		IAccount account = (_name, _address, _balance) -> {
			System.out.println("Opening Account for " + _name);
			return "Account Opened";
		};
		String result = account.openAccount("Kodewala", "BTM", 120000);
		System.out.println(result);
		
		Square square = n -> n*n;
		System.out.println(square.calcSquare(5));	
	}
}
