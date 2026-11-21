package com.kodewala.exception1;

class AccountCreation {
	private String name;
	private int balance;
	private boolean active;

	public AccountCreation(String name, int balance, boolean active) {
		super();
		this.name = name;
		this.balance = balance;
		this.active = active;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public boolean isActive() {
		return active;
	}
}

public class FundTransfer {

	public static void main(String[] args) {
		System.out.println("FundTransfer.main()..START");
		AccountCreation sender = new AccountCreation("Rahul", 10000, true);
		AccountCreation receiver = new AccountCreation("Amit", 5000, true);
		
		int transferAmount = 2000;
		try {
			System.out.println(sender.getName().length());
			int remainingBalance = sender.getBalance() - transferAmount;
			sender.setBalance(remainingBalance);
			int updatedReceiverBalance = receiver.getBalance() + transferAmount;
			System.out.println("Transfer Successful");
		}catch (NullPointerException e) {
			System.err.println("Account Details are missing ..");
			e.printStackTrace();
		}catch (ArithmeticException e) {
			System.err.println("Calculation Error");
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
