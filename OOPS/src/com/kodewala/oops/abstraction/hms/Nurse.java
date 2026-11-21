package com.kodewala.oops.abstraction.hms;

public class Nurse implements IHospitalOperations {

	@Override
	public void performDuty(Employee employee) {
		System.out.println("Nurse.performDuty()");
	}

	@Override
	public double calculateSalary(Employee employee) {
		return 20000;
	}

}
