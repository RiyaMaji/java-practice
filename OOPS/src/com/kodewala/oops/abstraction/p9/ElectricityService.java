package com.kodewala.oops.abstraction.p9;

public class ElectricityService {

	public void generateBill(int units) {
		if(units < 0) {
			System.out.println("Invalid Units!!!");
			return;
		}
		double charges = calculateCharges(units);
		double total = charges + calculateFees(charges);
		System.out.println("Total : " + total);
	}

	private double calculateFees(double charges) {
		return charges * 0.05 ;
	}

	private double calculateCharges(int units) {
		return 5 * units;
	}

}
