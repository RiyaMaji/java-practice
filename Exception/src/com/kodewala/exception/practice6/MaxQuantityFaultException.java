package com.kodewala.exception.practice6;

public class MaxQuantityFaultException extends OrderException {

	private static final long serialVersionUID = 1L;

	public MaxQuantityFaultException(String msg, String errorCode) {
		super(msg, errorCode);
	}
}
