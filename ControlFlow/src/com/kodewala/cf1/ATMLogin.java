package com.kodewala.cf1;

import java.util.Scanner;

public class ATMLogin {
	public static void main(String[] args) {
		int correctPin = 1234;
		int attempt = 0;
		Scanner sc = new Scanner(System.in);
		while(attempt!=3) {
			System.out.println("Enter Pin : ");
			int userInput = sc.nextInt();
			attempt++;
			if(userInput == correctPin) {
				System.out.println("Login Successful!!!");
				attempt+=3;
				break;
			}else {
				System.err.println("Incorrect Pin!!!");
			}
		}
		if(attempt == 3)
			System.err.println("Account Blocked");
		sc.close();
	}
}
