package com.kodewala.exception.practice2;

public class PaymentGateway {

	public static void main(String[] args) {
		PaymentGateway payment = new PaymentGateway();
		int amount;
		amount = payment.calculatePayment();
		System.out.println("Payment Amount : " + amount);
	}

	private int calculatePayment() {
		int finalAmount = 0;
		try {
				finalAmount = 1000 - 100;
				System.out.println("Return amount from try..");
				return finalAmount;
		} catch(Exception e){
			e.printStackTrace();
		}finally {
			finalAmount = 110;
			System.out.println("Returning amount from finally...");
			//return finalAmount;
		}
		return finalAmount;
	}

}
