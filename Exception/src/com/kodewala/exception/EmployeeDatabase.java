package com.kodewala.exception;

public class EmployeeDatabase {

	public static void main(String[] args) {
		System.out.println("EmployeeDatabase.main().START");
		
		EmployeeDatabase db = new EmployeeDatabase();
		try {
			db.displayEmployee();
		}catch (NullPointerException e) {
			System.out.println("Employee Details not found");
			e.printStackTrace();
		}
		System.out.println("EmployeeDatabase.main().END");
	}
	public void displayEmployee() {
		System.out.println("EmployeeDatabase.displayEmployee().start");
		String empName = fetchEmployeeName();
		System.out.println(empName.length());
		System.out.println("EmployeeDatabase.displayEmployee().end");
	}
	public String fetchEmployeeName() {
		System.out.println("EmployeeDatabase.fetchEmployeeName().start");
		return null;
	}
}
