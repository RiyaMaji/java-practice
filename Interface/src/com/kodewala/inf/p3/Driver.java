package com.kodewala.inf.p3;

public class Driver {

	public static void main(String[] args) {
		IEmployee emp = new PermanentEmployee();
		System.out.println(emp.calculateSalary());
		
		emp = new ContractEmployee();
		System.out.println(emp.calculateSalary());
		
		
		emp = new Intern();
		System.out.println(emp.calculateSalary());
		
	}

}
