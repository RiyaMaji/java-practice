package com.kodewala.exception.practice3;

public class PaymentProcessingException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PaymentProcessingException(String msg,Exception e) {
		super(msg,e);
	}
	
}
