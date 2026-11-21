package com.kodewala.controlflow.whileloop;

import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		int userGuess = 0;
		int expectedNumber = 25;
		int count = 5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your guess..");
		while(userGuess != expectedNumber && count!=0) {
			userGuess = sc.nextInt();
			if(userGuess == expectedNumber)
				System.out.println("Congrats!!");
			else {
				if(userGuess > 25)
					System.out.println("Your guess is too high");
				else
					System.out.println("Your guess is too low");
				count--;
			}
			if(count == 0)
				System.out.println("Game Over!!");
		}
		sc.close();
	}
}
