package com.kodewala.inf.p5;

public interface IOrder {
	void placeOrder();
	static boolean validateOrder(double amount) {
		return amount>=500;
	}
}
