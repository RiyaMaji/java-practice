package com.kodewala.control.flow.practice16;

import java.util.Scanner;

public class Driver2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter order amounts...");
		while(sc.nextDouble()> 0) {
			System.out.println("Eligible for free delivery!!..");
		}
		System.out.println("Processing Stopped..");
	}

}
