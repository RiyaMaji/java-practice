package com.kodewala.marker.p2;

import java.io.Serializable;

public class Employee implements Serializable{
	private static final long serialVersionUID = 1L;
	private int employeeId;
	private String employeeName;
	private transient double salary;
	private transient String password;
	public Employee(int employeeId, String employeeName, double salary, String password) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.password = password;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public String getPassword() {
		return password;
	}
	
}
