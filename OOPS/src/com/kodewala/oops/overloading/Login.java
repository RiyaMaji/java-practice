package com.kodewala.oops.overloading;

public class Login {
	public void doLogin(String mobile,int otp) {
		System.out.println("Login.doLogin() : " + mobile);
	}
	public void doLogin(String email,String password) {
		System.out.println("Login.doLogin() : " +email);
	}
	public void doLogin(String gmail) {
		System.out.println("Login.doLogin(): " + gmail);
	}


}
