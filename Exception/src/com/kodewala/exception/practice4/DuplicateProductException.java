package com.kodewala.exception.practice4;

public class DuplicateProductException extends Exception {
	private String errorCode;
	private static final long serialVersionUID = 1L;
	public DuplicateProductException(String message, String errorCode) {
		super(message);
		this.errorCode = errorCode;
	}
	public String getErrorCode() {
		return errorCode;
	}
}
