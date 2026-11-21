package com.bloodConnect;

import java.io.Serializable;

public class Employee implements Cloneable,Serializable{
	
	private static final long serialVersionUID = 1L;
	private int employeeId;
	private String employeeName;
	private Address address;
	private transient String password;
	public Employee(int employeeId, String employeeName, Address address, String password) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.address = address;
		this.password = password;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	//shallow cloning
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	//deep cloning
	public Employee deepClone() throws CloneNotSupportedException {
		Employee emp = (Employee)super.clone();
		emp.address = (Address)address.clone();
		return emp;
	}
	public void display() {

        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Employee Name: " + getEmployeeName());
        System.out.println("City: " + address.getCity());
        System.out.println("State: " + address.getState());
        System.out.println("Password: " + getPassword());
    }
}
