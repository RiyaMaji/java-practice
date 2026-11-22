package com.kodewala.cf1;

import java.util.Scanner;

public class ATMLogin {
	public static void main(String[] args) 
	{
		//Initialize choice with some value 
		int correctPin = 1234;
		
		//intialize attempt
		int attempt = 0;
		
		//input userchoice
		Scanner sc = new Scanner(System.in);
		
		//condition for loop--->requirement 1
		while(attempt!=3) {
			
			System.out.println("Enter Pin : ");
			int userInput = sc.nextInt();
			
			attempt++;
			//requirement 2
			if(userInput == correctPin) 
			{
				System.out.println("Login Successful!!!");
				attempt+=3;
				break;
			}else {
				System.err.println("Incorrect Pin!!!");
			}
		}
		//requirement 3
		if(attempt == 3)
			System.err.println("Account Blocked");
		sc.close();
	}
}
