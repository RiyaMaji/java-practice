package com.kodewala.oops.abstraction.p5;

public class LoginService {
	public void login(String _userName, String _password) {
		if(validateUserName(_userName) && validatePassword(_password) && checkAccountStatus()) {
			System.out.println("Login Successfull!!!");
		}else
			System.out.println("Login Failed !!!");
	}

	private boolean validatePassword(String _password) {
		return _password.equals("Ri!12");
	}

	private boolean validateUserName(String _userName) {
		return _userName.equalsIgnoreCase("riya");
	}

	private boolean checkAccountStatus() {
		return true;
	}
}
