package com.kodewala.exception.practice6;

public class UserAlreadyExistsException extends OrderException {

	private static final long serialVersionUID = 1L;

	public UserAlreadyExistsException(String msg, String errorCode) {
		super(msg, errorCode);
	}
}
