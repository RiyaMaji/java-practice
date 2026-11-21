package com.kodewala.oops.inheritance.p2;

public class Person {
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public void personDetails() {
		System.out.println("Person Name : " + name);
	}
}
