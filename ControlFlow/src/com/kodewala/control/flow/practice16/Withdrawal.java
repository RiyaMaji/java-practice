package com.kodewala.control.flow.practice16;

public class Withdrawal {
	static double processingWithdrawal(double balance, double _withdrawalAmount) {
		if (_withdrawalAmount <= 0) {

            System.out.println("Invalid Amount");

        } else if (_withdrawalAmount % 500 != 0) {

            System.out.println("Amount must be multiple of Rs.500");

        } else if (_withdrawalAmount > balance) {

            System.out.println("Insufficient Balance");

        } else {

            balance = balance - _withdrawalAmount;
            System.out.println("Withdrawal Successful");
        }
		return balance;
	}
}
