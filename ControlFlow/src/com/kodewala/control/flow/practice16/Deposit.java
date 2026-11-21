package com.kodewala.control.flow.practice16;

public class Deposit {
	static double processingDeposit(double _depositAmount, double balance) {
		if (_depositAmount > 0) {
            balance += _depositAmount;
            System.out.println("Deposit Successful");
        } else {
            System.out.println("Invalid Amount");
        }
		return balance;
	}
}
