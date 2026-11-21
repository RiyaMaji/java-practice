package com.kodewala.constructors.practice;
/**
 * A SavingsAccount should use the parameterized parent constructor when an account number is provided.
 * Create Savings Account with account number 5001.
 */
class BankAccount{
	BankAccount(){
		System.out.println("BankAccount.BankAccount()");
	}
	BankAccount(int accountNumber){
		System.out.println("Account Number : " + accountNumber);
	}
}
class SavingsAccount extends BankAccount{
	SavingsAccount(int accountNumber){
		super(accountNumber);
		System.out.println("Savings Account created...");
	}
}
public class Driver5 {

	public static void main(String[] args) {
		SavingsAccount account = new SavingsAccount(5001);
	}
}
