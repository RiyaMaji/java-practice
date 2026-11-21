package com.kodewala.inf.p8;

public class Driver {

	public static void main(String[] args) {
		
		IDiscount gold = amount -> amount *0.20;
		IDiscount silver = amount -> amount *0.10;
		IDiscount regular = amount -> amount *0.05;
		
		double amount = 5000;
		System.out.println("Gold :" + (amount - gold.calculateDiscount(amount)));
		System.out.println("Silver :" + (amount - silver.calculateDiscount(amount)));
		System.out.println("Regular :" + (amount - regular.calculateDiscount(amount)));
	}

}
