package com.kodewala.control.flow.practice4;

public class FareCalculator {
	public void calculateFare(double distance) {
		double fare=0.0f;
		if(distance <= 5) 
			fare = distance*15;
		else if(distance > 5 && distance <= 15 ) {
			distance-= 5;
			fare = (distance * 12 + (5*15));
		}
		else {
			distance -=15;
			fare = (distance *10 + (5*15)+ (10*12));
		}
		System.out.println("Total Fare :: " + fare);
	}
}
