package com.kodewala.control.flow.practice16;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] ordersAmount = new double[5];
		System.out.println("Enter the value of 5 orders :: ");
		for (int i = 0; i < ordersAmount.length; i++) {
			ordersAmount[i] = sc.nextDouble();
		}
		checkEligibility(ordersAmount);
	}

	static void checkEligibility(double[] ordersAmount) {
		Arrays.stream(ordersAmount).filter(n->n>=1000)
		.forEach(n->System.out.println(n + " : Eligible for free delivery"));
		
		DoubleStream.of(ordersAmount).filter(n->n<1000)
		.forEach(n->System.out.println(n +" : Delivery Charge Applicable"));	
	}

}
