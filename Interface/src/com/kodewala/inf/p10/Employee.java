package com.kodewala.inf.p10;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	private int eId;
	private String eName;
	private double eSalary;
	public Employee(int eId, String eName, double eSalary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int geteId() {
		return eId;
	}
	public String geteName() {
		return eName;
	}
	public double geteSalary() {
		return eSalary;
	}
}
