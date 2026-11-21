package com.kodewala.control.flow.practice6;

public class PaymentStatusHandler {

	public void handlePaymentStatus(int status) {
		
		switch (status) {
		case 1:
			System.out.println("Payment Successful!!..");
			break;
		case 2 :
			System.out.println("Payment Pending");
			break;
		case 3 :
			System.out.println("Payment Failed");
			break;
		case 4 :
			System.out.println("Payment Refunded");
			break;
		case 5 :
			System.out.println("Payment Cancelled");
			break;
		default:
			System.out.println("Wrong input !!");
			break;
		}
	}
}
