/**
 * Create a developer(Developer is an employee) with ID 101.
 */
package com.kodewala.constructors.practice;

class Employee {

	Employee(int employeeId) {
		System.out.println("Employee ID: " + employeeId);
	}
}

class Developer extends Employee {

	Developer(int employeeId) {

		super(employeeId);

		System.out.println("Developer created");
	}
}

public class Driver4 {

	public static void main(String[] args) {
		Developer developer = new Developer(101);

	}

}
