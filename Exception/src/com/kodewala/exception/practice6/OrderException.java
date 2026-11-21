package com.kodewala.exception.practice6;

public class OrderException extends Exception {

	private static final long serialVersionUID = 1L;
	private String errorCode;
	public OrderException(String msg,String errorCode) {
		
		super(msg);
		this.errorCode = errorCode;
	}
	public String getErrorCode() {
		return errorCode;
	}
	
}
