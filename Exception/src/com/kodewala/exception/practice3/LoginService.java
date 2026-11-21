package com.kodewala.exception.practice3;

public class LoginService {

	public static void main(String[] args) {
		try {
			login(null,"Java@123");
		} catch (IncorrectPasswordException  |NullPointerException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}

	private static void login(String userName, String password) throws IncorrectPasswordException,NullPointerException
	{
		if(userName == null || password == null)
			throw new NullPointerException("UserName or Password cannot be null...");
		if(!userName.equalsIgnoreCase("Riya") || !password.equalsIgnoreCase("Java@123"))
			throw new IncorrectPasswordException("Wrong Credentials!!");
		System.out.println("Login Successful!!!");
	}

}
