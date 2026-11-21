package com.kodewala.exception.practice6;

public class MinQuantityFaultException extends OrderException {

	private static final long serialVersionUID = 1L;

	public MinQuantityFaultException(String msg, String errorCode) {
		super(msg, errorCode);
	}
}
