package com.kodewala.marker.p4;

import java.io.Serializable;

public class Payment implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int transactionId;
	private double amount;
	PaymentDetails paymentDetails;
	public Payment(int transactionId, double amount, PaymentDetails paymentDetails) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.paymentDetails = paymentDetails;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
}
