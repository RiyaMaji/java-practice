package com.kodewala.encapsulation;

public interface IPayment {
	void makePayment(PaymentDetails paymentDetails);
	void refundPayment();
	void checkPaymentStatus(PaymentDetails paymentDetails);
}
