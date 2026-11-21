package com.kodewala.encapsulation;

public class Driver {

	public static void main(String[] args) {
		PaymentProcessor paymentProcessor = new PaymentProcessor();
		paymentProcessor.processPayment(new UPIPayment(), new PaymentDetails(800,"Riya Maji"));

	}

}
