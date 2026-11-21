package com.kodewala.inf.p2;

public class UPI implements IPayment {

	@Override
	public void processPayment(double amount) {
		System.out.println("UPI.processPayment()");
	}

	@Override
	public void refundPayment(double amount) {
	System.out.println("UPI.refundPayment()");

	}

}
