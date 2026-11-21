package com.kodewala.exception.practice4;

public class EmployeeNotFoundException extends EmployeeException{

	private static final long serialVersionUID = 1L;
	public EmployeeNotFoundException(String msg) {
		super(msg);
	}

}
