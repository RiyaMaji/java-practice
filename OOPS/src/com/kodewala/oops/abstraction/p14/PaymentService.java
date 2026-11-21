package com.kodewala.oops.abstraction.p14;

public class PaymentService {

	public void makePayment(double _amount) {
		if(validateAmount(_amount) && verifyPaymentMethod()) {
			processPayment(_amount);
			generateReceipt(_amount);
		}else
			System.out.println("Payment Failed !!!");
	}

	private void generateReceipt(double _amount) {
		System.out.println("Receipt Generated..");
	}

	private void processPayment(double _amount) {
		System.out.println("Payment Processed : " + _amount);		
	}

	private boolean validateAmount(double _amount) {
		return _amount > 0;
	}

	private boolean verifyPaymentMethod() {
		return true;
	}

}
