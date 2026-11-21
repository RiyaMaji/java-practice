package com.kodewala.oops.abstraction.p6;

public class BankService {

	private double receiverBalance = 4000;
	private double senderBalance = 5000;

	public void transferMoney(int amount) {
		if( validateRecipient() && checkBalance(amount) ) {
			creditAmount(amount);
			debitAmount(amount);
			System.out.println("Transfer Successful!!!");
		}else
			System.out.println("Transfer Failed !!!");
	}

	private void creditAmount(int _amount) {
		receiverBalance += _amount ;
	}

	private void debitAmount(int _amount) {
		senderBalance -= _amount ;
	}

	private boolean checkBalance(int _amount) {
		return _amount > 0 && senderBalance >= _amount;
	}

	private boolean validateRecipient() {
		return true;
	}

	public void displayBalances() {
		System.out.println("Sender Balance :" + senderBalance);
		System.out.println("Receiver Balance : " + receiverBalance);
	}

}
