package com.kodewala.control.flow.practice12;

public class BandhanBank {

	public void checkLoanEligibility(double salary, int creditScore) {
		if(salary >= 50000 && creditScore >= 750)
			System.out.println("Loan Approved");
		else if(salary >= 30000 && creditScore >= 650)
			System.out.println("Loan Can Be Considered");
		else
			System.err.println("Loan Rejected");
	}
}
