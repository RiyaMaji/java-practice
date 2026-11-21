package com.kodewala.scan;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Creates connection with Console

		System.out.println(" Please enter the name : ");
		String name = sc.nextLine(); // reading String input

		System.out.println(" Pls enter product price ... ");
		int price = sc.nextInt(); // reading integer ->this leaves new line character
		
		sc.nextLine(); //consumes extra char
		System.out.println(" Pls enter delivery address ... ");
		String address = sc.nextLine();
		//sc.next --> consumes single char
		
		System.out.println(" Name is:"+ name);
		System.out.println(" Price is : " + price);
		System.out.println(" Address  : " + address);
		
		sc.close(); // close the connection

	}

}
