package com.kodewala.oops.abstraction.p6;

public class Driver {

	public static void main(String[] args) {
		BankService bankService = new BankService();
		bankService.transferMoney(3000);
		bankService.displayBalances();
	}

}
