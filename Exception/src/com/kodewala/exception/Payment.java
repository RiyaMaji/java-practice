package com.kodewala.exception;

public class Payment {

	public static void main(String[] args) {
		String paymentAmount = "ABC";
		int discount = 10;
		try {
			int amount = Integer.parseInt(paymentAmount);
			int finalAmount = amount/discount ;
			System.out.println("Final Amount : " +finalAmount);
		}catch (NumberFormatException e) {
			System.err.println("Invalid Payment Amount..");
			e.printStackTrace();
		}catch (ArithmeticException e) {
			System.err.println("Invalid discount Calculation");
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	System.out.println("Payment Processing Completed");
	}

}
