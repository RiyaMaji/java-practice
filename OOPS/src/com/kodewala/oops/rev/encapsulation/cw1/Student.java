package com.kodewala.oops.rev.encapsulation.cw1;

public class Student {
	private String name;
	private void updateName(String _name) {
		System.out.println("Student.updateName()");
	}
	public void displayDetails(String _name) {
		System.out.println("Student.displayDetails()" + name);
		updateName(_name);
	}
}
