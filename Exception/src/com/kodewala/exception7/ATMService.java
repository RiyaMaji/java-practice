package com.kodewala.exception7;

public class ATMService {
	public static void main(String[] args) {
		try {
			withdraw(null,"156464");
		} catch (NullPointerException e) {
			System.err.println("Number cannot be null..");
		}catch (NumberFormatException e) {
			System.err.println("Pls enter the amount in correct Format...");
		}
	}

	private static void withdraw(String accountNumber, String amount) {
		if(!accountNumber.startsWith("SBI")) {
			System.out.println("Invalid Account..");
			return;
		}
		double withdrawalamount = Double.parseDouble(amount);
		System.out.println("Withdrawal amount : " + withdrawalamount);
		
	}
}
