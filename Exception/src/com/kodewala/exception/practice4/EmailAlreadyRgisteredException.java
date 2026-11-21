package com.kodewala.exception.practice4;

public class EmailAlreadyRgisteredException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String errorCode;

	public EmailAlreadyRgisteredException(String msg ,String errorCode) {
		super(msg);
		this.errorCode = errorCode;
	}

	public String getErrorCode() {
		return errorCode;
	}


}
