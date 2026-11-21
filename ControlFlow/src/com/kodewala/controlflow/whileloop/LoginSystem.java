package com.kodewala.controlflow.whileloop;

import java.util.Scanner;

public class LoginSystem {

	public static void main(String[] args) {
		String expectedPassword = "Java123";
		String userInput = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your password : ");
		while(expectedPassword != userInput) {
			userInput = sc.next();
			if(expectedPassword.equals(userInput))
				System.out.println("Login Successful!!");
			else
				System.out.println("Login Failed...Try again!!");
		}
		sc.close();
	}

}
