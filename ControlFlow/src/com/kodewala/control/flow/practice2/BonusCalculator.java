package com.kodewala.control.flow.practice2;

public class BonusCalculator {
	public double calculateBonus(double salary, int yearsOfExperience) {
		if(yearsOfExperience >= 10)
			return salary * 0.2; 
		else if(yearsOfExperience >= 5 )
				return salary * 0.15;  
		else if(yearsOfExperience >= 2 )
			return salary * 0.1;
		else 
			return salary * 0.05;
	}
}
