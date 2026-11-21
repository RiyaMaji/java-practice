package com.kodewala.oops.polymorphism3;

public class Client {

	public static void main(String[] args) {
		PaymentProcessor paymentProcessor = new PaymentProcessor();
		// for the user#1, he/she selected payment method as a Credit Card
		CreditCardPayment cardPayment = new CreditCardPayment();
		DebitCardPayment debitCardPayment = new DebitCardPayment();
		paymentProcessor.processPayment(debitCardPayment);
		//paymentProcessor. processPayment (cardPayment);

	}

}
