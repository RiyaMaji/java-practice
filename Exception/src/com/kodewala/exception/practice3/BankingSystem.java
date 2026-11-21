package com.kodewala.exception.practice3;

public class BankingSystem {

	public static void main(String[] args) {
		try {
			withdrawMoney(5000,5000);
		} catch (InsufficientBalanceException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}

	private static void withdrawMoney(int balance, int amount) throws InsufficientBalanceException {
		validateBalance(balance,amount);
		System.out.println("Withdrawal Successful!!");
	}

	private static void validateBalance(int balance, int amount) throws InsufficientBalanceException{
		if(amount > balance)
			throw new InsufficientBalanceException("Insufficient Balance!!");
		
	}

}
