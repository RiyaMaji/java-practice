package com.kodewala.encapsulation;

public class PaymentProcessor {
	public void processPayment(IPayment payment,PaymentDetails paymentDetails) {
		payment.makePayment(paymentDetails);
		payment.checkPaymentStatus(paymentDetails);
	}

}
