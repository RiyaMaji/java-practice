package com.kodewala.inf4;

public interface IEmployee {
	public void display();
	default void doSomething() {
		System.out.println("IEmployee.doSomething()");
	}
}
