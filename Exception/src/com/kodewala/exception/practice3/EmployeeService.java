package com.kodewala.exception.practice3;

public class EmployeeService {

	public static void main(String[] args) {
		try {
			validateEmployeeId("RI2096");
		} catch (InvalidEmployeeIdException e) {
			System.err.println(e.getMessage());
			System.err.println(e.getCause());
			e.printStackTrace();
		}

	}

	private static void validateEmployeeId(String empId) throws InvalidEmployeeIdException{
		
		try {
			int id = Integer.parseInt(empId);
			System.out.println("Welcome " + id);
		} catch (NumberFormatException e) {
			throw new InvalidEmployeeIdException( "Employee ID must contain only numbers",
	                e);
		}
	}

}
