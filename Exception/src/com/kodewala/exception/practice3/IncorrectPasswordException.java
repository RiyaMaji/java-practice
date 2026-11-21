package com.kodewala.exception.practice3;

public class IncorrectPasswordException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IncorrectPasswordException(String msg) {
		super(msg);
	}

}
