package com.kodewala.inf.p3;

public class PermanentEmployee implements IEmployee {

	@Override
	public double calculateSalary() {
		 double basic = 30000;
	     double hra = 10000;
	     double da = 5000;

		return basic + hra + da;
	}

}
