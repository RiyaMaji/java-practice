package com.kodewala.oops.abstraction.hms;

public class Employee {
	private int employeeID;
	private String employeeName;
	private String department;
	public Employee(int employeeID, String employeeName,String department) {
		super();
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.department = department;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	

}
