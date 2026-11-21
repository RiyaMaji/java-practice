package com.kodewala.control.flow.practice;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		EcommDel del1 = new EcommDel();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the order amount : ");
		double orderAmount = sc.nextInt();
		sc.nextLine();
		double finalAmount = del1.calculateDeliveryCharge(orderAmount);
		System.out.println("Order Total :: " + finalAmount);
	}

}
