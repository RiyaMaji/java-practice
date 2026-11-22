package com.kodewala.control.flow.practice10;

public class Driver {

	public static void main(String[] args) {
		
		int option = Integer.parseInt(args[0]);
		
		BankApplication operation = new BankApplication();
		operation.performOperation(option);

	}

}
