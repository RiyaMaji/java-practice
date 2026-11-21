package com.kodewala.array5;

public class BankService {
	public void checkBalance(Customer customer){
		if(customer.getAccountBalance() < 2000)
			System.err.println("Low Balance Alert!!..");
		else if(customer.getAccountBalance() >= 2000)
			System.out.println("Balance Maintained...");
		else
			System.out.println("Invalid!!");
	}
}
