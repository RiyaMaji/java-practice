package com.kodewala.exception.practice1;

public class BankTransfer {
	public static void main(String[] args) {
		 Account sender = new Account();

	        sender.setAccountHolder("Rahul");
	        sender.setBalance(10000);
	        sender.setActive(true);
	        
	        int transferAmount = -2000;
	        
	        try {
	        	if(!sender.isActive())
	        		System.err.println("Account is inactive..");
	        	else if(transferAmount <= 0)
	        		System.err.println("Transfer Amount must be positive..");
	        	else if(sender.getBalance() < transferAmount)
	        		System.err.println("Insufficient Balance");
	        	else {
	        		int remainingBalance =
	                        sender.getBalance() - transferAmount;

	                sender.setBalance(remainingBalance);

	                System.out.println("Transfer successful");
	                System.out.println("Remaining Balance: "
	                        + sender.getBalance());
	        	}
	        }catch (NullPointerException e) {
	        	 System.err.println("Account details are missing");
	         e.printStackTrace();
	        	 System.err.println(e.getMessage());
			}catch (Exception e) {
				System.err.println("Unexpected error occurred");
	            e.printStackTrace();
	        }

	        System.out.println("Bank transaction process completed");
	    
	}
}

class Account {

	private String accountHolder;
	private int balance;
	private boolean active;

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
}
