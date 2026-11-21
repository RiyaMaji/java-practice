package com.kodewala.oops.abstraction.hms;

public class Driver {

	public static void main(String[] args) {
		HospitalProcessor hp = new HospitalProcessor();
		hp.processOperation(new Nurse(), new Employee(123,"Yuds","Gynae"));

	}

}
