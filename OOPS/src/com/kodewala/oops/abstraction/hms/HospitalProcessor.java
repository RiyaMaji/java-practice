package com.kodewala.oops.abstraction.hms;

public class HospitalProcessor {
	public void processOperation(IHospitalOperations hospitalOperations ,Employee employee) {
		System.out.println(hospitalOperations.calculateSalary(employee));
		
	}
}
