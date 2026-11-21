package com.kodewala.inf.p3;

public class ContractEmployee implements IEmployee {

	@Override
	public double calculateSalary() {
		int workingDays = 30 ;
		double dailyWage = 1900 ;
		return workingDays * dailyWage;
	}

}
