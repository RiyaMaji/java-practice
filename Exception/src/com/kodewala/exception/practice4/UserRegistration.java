package com.kodewala.exception.practice4;

public class UserRegistration {

	public static void main(String[] args) {
		try {
			register("rriya@gmail.com");
		} catch (EmailAlreadyRgisteredException e) {
			System.err.println(e.getMessage());
			System.err.println(e.getErrorCode());
			e.printStackTrace();
		}
	}

	private static void register(String email) throws EmailAlreadyRgisteredException
	{
		String registeredEmail = "rriya@gmail.com";
		if(email.equalsIgnoreCase(registeredEmail))
			throw new EmailAlreadyRgisteredException("This " + email + " emailid is already registered!!" ,"AMZ101");
		System.out.println("User registered successfully");
	}

}
