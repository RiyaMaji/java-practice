package com.kodewala.oops.abstraction.p1;

public class ATMService {
	private double balance = 100000;

	public void withdraw(int pin, double amount) {
		if (validate(pin)) {
			if (checkBalance(amount)) {
				deductMoney(amount);
				System.out.println("Withdrawl Successfull!!!....");
			} else
				System.out.println("Insufficient Balance");
		}else
			System.out.println("Wrong PIN!!!...");
	}

	private void deductMoney(double amount) {
		balance -= amount;
	}

	private boolean checkBalance(double amount) {
		return balance >= amount;
	}

	private boolean validate(int pin) {
		return pin == 1234;
	}

}
