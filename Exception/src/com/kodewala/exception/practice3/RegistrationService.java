package com.kodewala.exception.practice3;

public class RegistrationService {

	public static void main(String[] args) {
		try {
			registerUser("Riya Maji",null);
		} catch (NullPointerException e) {
			System.err.println("Email id cannot be null....");
			e.printStackTrace();
		}catch (UserAlreadyExistsException e) {
			e.printStackTrace();
		}
	}

	private static void registerUser(String name ,String email) throws UserAlreadyExistsException,NullPointerException {
		String existingEmail ="abc@gmail.com";
		if(email.equalsIgnoreCase(existingEmail))
			throw new UserAlreadyExistsException("User AlreadyExists!!");
		System.out.println("Registration Successful!!!");
		
	}

}
