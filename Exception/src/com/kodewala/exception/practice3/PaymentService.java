package com.kodewala.exception.practice3;



public class PaymentService {

	public static void main(String[] args) {
		int balance = 10000;
		try {
			transferMoney(000,balance);
		} catch (InsufficientBalanceException | IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	private static void transferMoney(int amount,int balance) throws InsufficientBalanceException{
		if(amount<=0)
			throw new IllegalArgumentException("Transfer Amount must be positive");
		if(amount > balance)
			throw new InsufficientBalanceException("Transfer amount is more than available balance");
		balance -= amount;
		System.out.println("Transfer Successful!!!");
		System.out.println("Remaining Balance : " + balance);
	}

}
