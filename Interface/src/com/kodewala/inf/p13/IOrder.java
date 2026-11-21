package com.kodewala.inf.p13;

public interface IOrder {
	void placeOrder();
	public interface Payment{
		public abstract void processPayment();
	}
}
