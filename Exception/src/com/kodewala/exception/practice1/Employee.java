package com.kodewala.exception.practice1;

public class Employee {
	private String employeename;
	private double monthlySalary;
	private int numberOfWorkingDays;
	
	public Employee(String employeename, double monthlySalary, int numberOfWorkingDays) {
		super();
		this.employeename = employeename;
		this.monthlySalary = monthlySalary;
		this.numberOfWorkingDays = numberOfWorkingDays;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public double getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
	public int getNumberOfWorkingDays() {
		return numberOfWorkingDays;
	}
	public void setNumberOfWorkingDays(int numberOfWorkingDays) {
		this.numberOfWorkingDays = numberOfWorkingDays;
	}
	

}
