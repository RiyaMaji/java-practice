package com.kodewala.inf4;

public interface IPerson {
	public void display();
	default void doSomething() {
		System.out.println("IPerson.doSomething()");
	}
}
