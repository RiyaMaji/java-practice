package com.kodewala.control.flow.practice10;

public class BankApplication {

	public void performOperation(int option) {
		switch (option) {
		case 1:
			System.out.println("Check Balance");
			break;
		case 2:
			System.out.println("Deposit");
			break;
		case 3:
			System.out.println("Withdraw");
			break;
		case 4:
			System.out.println("Transfer Money");
			break;
		case 5 :
			System.out.println("Change PIN");
			break;
		default:
			System.err.println("Wrong Input !!!");
			break;
		}
		
	}

}