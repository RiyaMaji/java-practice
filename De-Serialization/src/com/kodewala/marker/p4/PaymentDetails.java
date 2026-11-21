package com.kodewala.marker.p4;

import java.io.Serializable;

public class PaymentDetails implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String paymentMode;
	private String bankName;
	public PaymentDetails(String paymentMode, String bankName) {
		super();
		this.paymentMode = paymentMode;
		this.bankName = bankName;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public String getBankName() {
		return bankName;
	}
}
