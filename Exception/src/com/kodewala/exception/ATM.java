package com.kodewala.exception;

public class ATM {

	public static void main(String[] args) {
		System.out.println("ATM.START...");
		int balance = 10000;
		int noOfWithdrawal = 0;
		
		try {
			int avgWithdarwalAmount = balance / noOfWithdrawal;
			System.out.println("Avg Withdarwal Amount: " + avgWithdarwalAmount);
		}catch (ArithmeticException e) {
			System.err.println("noOfWithdrawal cannot be zero");
			System.out.println(e.getMessage());
		}
		System.out.println("ATM END..");
	}

}
