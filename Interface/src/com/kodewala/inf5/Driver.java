package com.kodewala.inf5;

public class Driver {

	public static void main(String[] args) {
		User user = new User("riya","riya");
		DataCleaner dataCleaner = new DataCleaner();
		//cleaning the user object
		dataCleaner.clean(user);

	}

}
