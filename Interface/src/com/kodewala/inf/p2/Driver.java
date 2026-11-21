package com.kodewala.inf.p2;

public class Driver {
	static void makePayment(IPayment payment,double amount) {
		payment.processPayment(amount);
	}
	public static void main(String[] args) {
		makePayment(new CreditCard(), 5000);
		makePayment(new NetBanking(), 12000);
		makePayment(new UPI(), 1800);
	}

}
