package com.kodewala.encapsulation;

public class PaymentDetails {
	private int transactionID;
	private double amount;
	private Boolean paymentStatus;
	private String customerName;
	public PaymentDetails(double amount, String customerName) {
		super();
		this.amount = amount;
		this.customerName = customerName;
	}
	public int getTransactionID() {
		return transactionID;
	}
	public double getAmount() {
		return amount;
	}
	public Boolean getPaymentStatus() {
		return paymentStatus;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setPaymentStatus(Boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
}
