package com.kodewala.inf.p14;

public class Driver {

	public static void main(String[] args) {
		UPIPayment upiPayment = new UPIPayment();
		upiPayment.applyCashback();
		upiPayment.generateReceipt();
		upiPayment.pay();
	}

}
