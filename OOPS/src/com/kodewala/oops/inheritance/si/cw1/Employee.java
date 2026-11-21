package com.kodewala.oops.inheritance.si.cw1;

public class Employee {
	private String empName;
	private String empId;
	
	public Employee(String empName, String empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public void displayEmployee() {
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee Id : " + empId);
	}
}
