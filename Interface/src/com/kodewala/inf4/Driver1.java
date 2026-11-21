package com.kodewala.inf4;

public class Driver1 {

	public static void main(String[] args) {
		EmployeeProcessor emp = new EmployeeProcessor();
		emp.display();
		IEmployee emp1 = new EmployeeProcessor();
		emp1.display();
		IPerson emp2 = new EmployeeProcessor();
		emp2.display();

	}

}
