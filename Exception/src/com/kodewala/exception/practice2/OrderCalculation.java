package com.kodewala.exception.practice2;

public class OrderCalculation {

	public static void main(String[] args) {
		OrderCalculation order = new OrderCalculation();
		int finalAmount = order.calculateAmount(1500,200);
		System.out.println("Final Amount : " + finalAmount);

	}

	private int calculateAmount(int amount,int discount) {
		try {
			int finalAmount = amount - discount;
			System.out.println("Calculating Order Amount :" + finalAmount);
			return finalAmount;
		} finally {
			System.out.println("Order Calculation Completed!!!");
		}
	}

}
