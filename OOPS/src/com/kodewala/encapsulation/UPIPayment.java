package com.kodewala.encapsulation;

public class UPIPayment implements IPayment {
	double balance = 1000;

	@Override
	public void makePayment(PaymentDetails paymentDetails) {
		if (paymentDetails.getAmount() < balance) {
			balance -= paymentDetails.getAmount();
			System.out.println(
					paymentDetails.getAmount() + " sent to " + paymentDetails.getCustomerName() + " through UPI!!");
			paymentDetails.setPaymentStatus(true);
		} else {
			System.err.println("Low Balance Alert!!!");
			paymentDetails.setPaymentStatus(false);
		}
	}

	@Override
	public void refundPayment() {
		System.err.println("Under Process!!");
	}

	@Override
	public void checkPaymentStatus(PaymentDetails paymentDetails) {
		if (paymentDetails.getPaymentStatus() == true)
			System.out.println("Payment done!!!");
		else
			System.err.println("Payment Failed!!");
	}

}
