package com.kodewala.control.flow.practice3;

public class WithdrawlValidation {

	public void withdraw(double balance, double amount) {
		if(amount<0)
			System.out.println("Withdrawl amount cannot be negetive.....");
		else if(amount > balance)
			System.out.println("Insufficient Balance");
		else if(amount%500 == 0)
			System.out.println("Withdrawal successful");
		else
		System.out.println("Only 500rs notes are available.....");
		
	}

}
