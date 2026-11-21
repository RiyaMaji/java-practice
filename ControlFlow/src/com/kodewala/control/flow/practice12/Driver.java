package com.kodewala.control.flow.practice12;

public class Driver {

	public static void main(String[] args) {
		BandhanBank loan = new BandhanBank();
		double salary = Double.parseDouble(args[0]); 
		int creditScore = Integer.parseInt(args[1]);
		loan.checkLoanEligibility(salary, creditScore);

	}

}
