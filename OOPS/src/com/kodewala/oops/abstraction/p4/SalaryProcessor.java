package com.kodewala.oops.abstraction.p4;

public class SalaryProcessor {
	public void generateSalary(double basicSalary) {
		if(basicSalary <= 0) {
			System.out.println("Invalid Salary !!!...");
			return;
		}
		double allowance = calculateAllowance(basicSalary);
		double tax = calculateTax(basicSalary);
		double netSalary = basicSalary + allowance - tax ;
		System.out.println("Net Salary : " + netSalary);
	}

	private double calculateTax(double basicSalary) {
		return basicSalary * 0.10 ;
	}

	private double calculateAllowance(double basicSalary) {
		return basicSalary * 0.20 ;
	}

}
