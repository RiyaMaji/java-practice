package com.kodewala.inf.p13;

import com.kodewala.inf.p13.IOrder.Payment;

public class UPIPayment implements Payment {

	@Override
	public void processPayment() {
		System.out.println("UPIPayment.processPayment()");

	}

}
