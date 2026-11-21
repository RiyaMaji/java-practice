package com.kodewala.inf.p2;

public class NetBanking implements IPayment {

	@Override
	public void processPayment(double amount) {
		System.out.println("NetBanking.processPayment()");
	}

	@Override
	public void refundPayment(double amount) {
	System.out.println("NetBanking.refundPayment()");

	}

}
