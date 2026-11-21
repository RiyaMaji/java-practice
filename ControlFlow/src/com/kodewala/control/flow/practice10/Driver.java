package com.kodewala.control.flow.practice10;

public class Driver {

	public static void main(String[] args) {
		BankApplication operation = new BankApplication();
		int option = Integer.parseInt(args[0]);
		operation.performOperation(option);

	}

}
