package com.kodewala.control.flow.practice6;

public class Driver {

	public static void main(String[] args) {
		PaymentStatusHandler psh = new PaymentStatusHandler();
		psh.handlePaymentStatus(Integer.parseInt(args[0]));
	}

}
