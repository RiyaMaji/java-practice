package com.kodewala.exception.practice6;

public class InsufficientBalanceException extends OrderException {

	private static final long serialVersionUID = 1L;

	public InsufficientBalanceException(String msg, String errorCode) {
		super(msg, errorCode);
	}
}
