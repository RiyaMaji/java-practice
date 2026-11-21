package com.kodewala.inf.p13;

public class Driver {

	public static void main(String[] args) {
		IOrder.Payment pay = new UPIPayment();
		pay.processPayment();
		
	}

}
