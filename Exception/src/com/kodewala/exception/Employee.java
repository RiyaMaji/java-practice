package com.kodewala.exception;

public class Employee {

	public static void main(String[] args) {
		System.out.println("Employee.main().START");
		String empName = "Adbhut";
		try {
			System.out.println(empName.toUpperCase());
			System.out.println("Employee Information Displayed");
		}catch (NullPointerException e) {
			System.err.println("Emplyee name is missing");
			e.printStackTrace();
		}
		System.out.println("Employee.main()..END");
	}

}
