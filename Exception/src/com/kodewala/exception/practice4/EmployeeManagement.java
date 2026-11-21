package com.kodewala.exception.practice4;

public class EmployeeManagement {

	public static void main(String[] args) {
		try {
			validateEmployee("E101");
		}catch(EmployeeNotFoundException e) {
			System.err.println("Employee Not Found...");
		} catch(EmployeeAlreadyExistsException e) {
			System.err.println("Employee Already exists!!");
		}catch (EmployeeException e) {
		System.err.println("Employee operation Failed!!");
		}
	}

	private static void validateEmployee(String empId) throws EmployeeException{
		String existingEmpId ="E101";
		if(empId.equalsIgnoreCase(existingEmpId))
			throw new EmployeeAlreadyExistsException("Employee Already exists!!");
		else if(empId.equals("E102"))
			throw new EmployeeNotFoundException("Employee does not exist");
		}

}
