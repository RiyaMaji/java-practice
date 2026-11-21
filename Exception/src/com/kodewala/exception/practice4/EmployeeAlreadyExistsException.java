package com.kodewala.exception.practice4;

public class EmployeeAlreadyExistsException extends EmployeeException {

	private static final long serialVersionUID = 1L;

	public EmployeeAlreadyExistsException(String msg) {
		super(msg);
	}
}
