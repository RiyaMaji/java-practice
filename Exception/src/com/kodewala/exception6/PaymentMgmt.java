package com.kodewala.exception6;

import java.io.FileNotFoundException;

public class PaymentMgmt {
	public void doPayment(String account, int amount) throws FundTransferException{
		//check the balance
		try {
			checkBalance(account, amount);
		} catch (InsufficientBalanceException | FileNotFoundException e) {
			throw new FundTransferException("You dont have enough balance Or" 
					+ " in case you have opened the account recently "
					+ "pls wait for 24 hrs");
		}
	}

	private boolean checkBalance(String account, int amount)throws InsufficientBalanceException , FileNotFoundException
	{
		boolean checkBalanceStatus = false;
		// check the balance
		int balance = 1000; // from database
		if(amount > balance)
		{   // balance is not enough
			throw new InsufficientBalanceException(account + "does not have enough balance and current balance is " + balance);
		}else {
			checkBalanceStatus =true;
		}
		return checkBalanceStatus;
	}
}
