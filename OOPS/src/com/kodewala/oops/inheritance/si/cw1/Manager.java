package com.kodewala.oops.inheritance.si.cw1;

public class Manager extends Employee{   //IS-A
	
	String department;
	
	public Manager(String empName, String empId,String department) {
		super(empName, empId);
		this.department = department;
	}

	public void displayManager() {
		displayEmployee();
		System.out.println("Department : " + department);
	}
	

}
