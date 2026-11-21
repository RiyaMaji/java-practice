package com.kodewala.inf3;

@FunctionalInterface
public interface IAccount {
	String openAccount(String name, String address, double balance); // Only one abstract method - SAM

	default void addBeni() {

	}
}
