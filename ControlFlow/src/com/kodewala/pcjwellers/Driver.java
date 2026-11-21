package com.kodewala.pcjwellers;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		DiscountedPrice dp = new DiscountedPrice();
		
		System.out.println("Please fill the purchase value : ");
		double pValue = sc.nextDouble();
		sc.nextLine(); 
		if (pValue > 1000) {
			System.out.println("Please provide cx type : ");
			String cxType = sc.nextLine();
			dp.finalPrice(pValue, cxType);
		} else
			System.out.println("Discount Not Applicable !!!...");
	}
}
