package com.kodewala.oops.cw1;

public class FundTransfer {
	
	 private String accountHolderName ; 
	 private String accountNumber ;
	 private double balance ; 
	 private double amount ;
	 
	 public FundTransfer(String accountHolderName, String accountNumber, double balance, double amount) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.amount = amount;
	 }
	 public String getAccountHolderName() {
		 return accountHolderName;
	 }
	 public void setAccountHolderName(String accountHolderName) {
		 this.accountHolderName = accountHolderName;
	 }
	 public String getAccountNumber() {
		 return accountNumber;
	 }
	 public double getAmount() {
		 return amount;
	 }
	 public void setAccountNumber(String accountNumber) {
		 this.accountNumber = accountNumber;
	 }
	 public double getBalance() {
		 return this.balance;
	 }
	 //setter for balance
	 public double doCredit(double _amount) {
		 if(_amount > 0) {
			 return balance += _amount;
		 }	
		 else {
			 System.err.println("Please Provide a positive input!!");
			 return balance;
		 }
	 }
	 //setter for balance
	 public double doDebit(double _amount) {
		 if(balance > _amount)
			 return balance -= _amount;
		 else {
			 System.out.println("Insufficient Balance !!!");
			 return balance;
		 }
	 }
	 public void setAmount(double amount) {
		 this.amount = amount;
	 }
	 

}
