package com.kodewala.exception.practice3;

public class InvalidEmployeeIdException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidEmployeeIdException(String msg, Throwable cause) {
		super(msg,cause);
	}
	
}
