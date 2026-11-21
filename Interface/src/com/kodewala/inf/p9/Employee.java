package com.kodewala.inf.p9;

public class Employee {
	private String eName;
	private double eSalary;
	private String eDept;
	private int eYOE;
	public Employee(String eName,double eSalary, String eDept, int eYOE) {
		super();
		this.eSalary = eSalary;
		this.eName = eName;
		this.eDept = eDept;
		this.eYOE = eYOE;
	}
	public String geteName() {
		return eName;
	}
	public double geteSalary() {
		return eSalary;
	}
	public String geteDept() {
		return eDept;
	}
	public int geteYOE() {
		return eYOE;
	}
	
}
