package com.kodewala.exception.practice4;

public class InternalServerException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InternalServerException(String msg,Throwable cause) {
		super(msg,cause);
	}
	
}

