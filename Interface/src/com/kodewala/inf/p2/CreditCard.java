package com.kodewala.inf.p2;

public class CreditCard implements IPayment {

	@Override
	public void processPayment(double amount) {
		System.out.println("CreditCard.processPayment()");
	}

	@Override
	public void refundPayment(double amount) {
	System.out.println("CreditCard.refundPayment()");

	}

}
