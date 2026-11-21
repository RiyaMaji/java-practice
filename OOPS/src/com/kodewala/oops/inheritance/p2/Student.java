package com.kodewala.oops.inheritance.p2;

public class Student extends Person {
	private int rollNumber;

	public Student(String name, int rollNumber) {
		super(name);
		this.rollNumber = rollNumber;
	}

	public void studentDetails() {
		personDetails();
		System.out.println("Roll Number :" + rollNumber);
	}
}
