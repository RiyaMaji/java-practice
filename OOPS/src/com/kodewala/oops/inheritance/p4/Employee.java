package com.kodewala.oops.inheritance.p4;

public class Employee extends Person{

	private String name;

	public Employee(String name, String name2) {
		super(name);
		name = name2;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
