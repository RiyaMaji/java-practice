package com.kodewala.oops.polymorphism3;

public class PaymentProcessor {
	public void processPayment(Payment payment) { //This can accept any type of payment object
		//payment = new Payment();
		// payment = new NetBanking();
		// payment = new CreditCardpayment()
		payment.doPayment(); //polymorphism
	}
}