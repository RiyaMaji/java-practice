package com.kodewala.control.flow.practice3;

import java.util.Scanner;

//ATM Withdrawal Validation 
public class Driver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		WithdrawlValidation wvalid = new WithdrawlValidation();
		
		System.out.println("Please enter available balance : ");
		double balance = sc.nextDouble();
		System.out.println("Please enter withdrawl amount : ");
		double amount =sc.nextDouble();
		wvalid.withdraw(balance,amount);
		
	}

}
