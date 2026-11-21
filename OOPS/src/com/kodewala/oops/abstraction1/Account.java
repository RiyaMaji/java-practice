package com.kodewala.oops.abstraction1;

public class Account {
	//responsible for opening an account
	//RBI --> One pan card cannot have more than 5 accounts
	public boolean openAccount(String name, String address, String pan) {
		connectWithDB();
		validateNameAndAddress(name, address);
		validatePan(pan);
		findAccountByPanCard(pan);
		createUserID();
		notifyUser();
		return true;
	}

	public boolean validateNameAndAddress(String name, String address) {
		System.out.println("Account.validateNameAndAddress() .. Validating name and address");
		return true;
	}

	public boolean validatePan(String pan) {
		System.out.println("Account.validatePan() .. validating pan");
		return true;
	}

	public void connectWithDB() {

		System.out.println("Account.connectWithDB() .... DB connection");
	}

	public String createUserID() {

		System.out.println("Account.createUserID() ... creating user id ... ");
		return "some User id .... ";
	}
	public int findAccountByPanCard(String pan) {
		System.out.println("Account.findAccountByPanCard()");
		return 3;
	}

	public void notifyUser() {
		System.out.println("Account.notifyUser() .... ");
	}

}
