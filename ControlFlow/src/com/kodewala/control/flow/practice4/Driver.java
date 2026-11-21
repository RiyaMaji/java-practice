package com.kodewala.control.flow.practice4;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		FareCalculator fCalc = new FareCalculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance : ");
		double distance = sc.nextDouble();
		fCalc.calculateFare(distance);

	}

}
