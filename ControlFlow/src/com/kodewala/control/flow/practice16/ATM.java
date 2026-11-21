package com.kodewala.control.flow.practice16;

import java.util.Scanner;

public class ATM {
	Scanner sc = new Scanner(System.in);
	
	void displayPage(int option) {
		double balance = 100000;
		while (option != 4) {
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Exit");

			System.out.print("Enter your choice: ");
			option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Balance: Rs." + balance);
				break;

			case 2:
				System.out.print("Enter deposit amount: ");
				double depositAmount = sc.nextDouble();
				balance = Deposit.processingDeposit(depositAmount, balance);
				break;

			case 3:
				System.out.print("Enter withdrawal amount: ");
				double withdrawalAmount = sc.nextDouble();
				balance = Withdrawal.processingWithdrawal(balance, withdrawalAmount);
				break;

			case 4:
				System.out.println("Thank you for using ATM");
				break;

			default:
				System.out.println("Invalid Option");
				break;
			}
		}
	}
}
