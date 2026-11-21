package com.kodewala.sbi;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer customerArray[] = new Customer[3];
		for (int i = 0; i < customerArray.length; i++) {
			customerArray[i] = new Customer(sc.next(),sc.nextDouble(),sc.next()) ;
		}
		for (int i = 0; i < customerArray.length; i++) {
			System.out.println(customerArray[i].checkBalance(customerArray[i].accountBalance));
		}
	}

}
