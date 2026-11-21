package com.kodewala.oops.overloading;

public class Client {

	public static void main(String[] args) {
		Login login = new Login();
		login.doLogin("riya@gmail.com");
		
		login.doLogin("7908711900", 5236);
	}

}
