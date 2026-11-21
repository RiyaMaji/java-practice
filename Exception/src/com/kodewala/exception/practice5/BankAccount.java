package com.kodewala.exception.practice5;

import com.kodewala.exception6.InsufficientBalanceException;

public class BankAccount {

	public static void main(String[] args) {
		
		try {
			deposit(1234);
			withdraw(9123);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	private static void withdraw(int amount) {
		int balance = 1000;
		if(amount>balance)
			throw new InsufficientBalanceException("Insufficient Balance");
		System.out.println("Withdrawal successful!!");
	}

	private static void deposit(int amount) throws Exception{
		if(amount < 0)
			throw new IllegalArgumentException("Deposit amount must be positive");
		System.out.println("Deposit Successful");
	}

}
