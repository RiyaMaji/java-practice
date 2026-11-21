package com.kodewala.oops.cw1;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int choice = 0;
		double transferAmount = 0.0f;
		double currentBalance = 10000;

		System.out.println("Lets Begin Fund Transfer!!!! ");

		FundTransfer ft = new FundTransfer("Generic User", "Mi3465", currentBalance, transferAmount);
		while (choice != 5) {
			System.out.println("1. Credit ");
			System.out.println("2. Debit ");
			System.out.println("3. Check Balance ");
			System.out.println("4. Check Account Details : ");
			System.out.println("5. Exit");

			System.out.println("Enter your choice : ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Please enter the amount : ");
				transferAmount = sc.nextDouble();
				currentBalance = ft.doCredit(transferAmount);
				System.out.println("Current Balance : " + currentBalance);
				break;
			case 2:
				System.out.println("Please enter the amount : ");
				transferAmount = sc.nextDouble();
				currentBalance = ft.doDebit(transferAmount);
				System.out.println("Current Balance : " + currentBalance);
				break;
			case 3:
				System.out.println("Current Balance : " + ft.getBalance());
				break;
			case 4:
				System.out.println("Account Holder Name : " + ft.getAccountHolderName());
				System.out.println("Account Number : " + ft.getAccountNumber());
				System.out.println("Current Balance : " + ft.getBalance());
				break;
			case 5:
				System.out.println("Thank you for using Fund Transfer!");
				break;
			default:
				System.err.println("Wrong Input !!!Please choose 1 to 5...");
				break;
			}
		}
		sc.close();

	}

}
