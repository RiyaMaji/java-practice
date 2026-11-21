package com.kodewala.inf.p2;

public interface IPayment {
	void processPayment(double amount);
	void refundPayment(double amount);
}
