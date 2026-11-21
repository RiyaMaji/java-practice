package com.kodewala.control.flow.practice15;

public class Insurance {

	public void calculatePremium(int vehicleType, int age) {
		double premium ;
		switch (vehicleType) {
		case 1:{
			    premium = 5000;
				basePemium(premium,age);
				break;
			}
		case 2 :{
				premium = 10000;
				basePemium(premium,age);
				break;
			}
		case 3 :{
				premium = 20000;
				basePemium(premium,age);
				break;
			}
		default:
			System.err.println("Invalid Vehicle Type!!!");
			break;
		}
		
	}

	void basePemium(double premium, int age) {
		if(age < 25)
			System.out.println(premium += premium * 0.2);	
		else if(age >= 25 && age <= 50)
			System.out.println(premium);
		else
			System.out.println(premium += premium * 0.1);
	}

}
