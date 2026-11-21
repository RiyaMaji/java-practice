package com.kodewala.inf.p14;

public interface IPayment {
	void pay();
	public default void generateReceipt() {
		System.out.println("Payment.generateReceipt()");
	}
}
