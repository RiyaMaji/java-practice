package com.kodewala.control.flow.practice20;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Customer Type..");
		System.out.println("1. Premiun");
		System.out.println("2. Standard");
		System.out.println("3. Guest");
		System.out.println("Delivery Option..");
		System.out.println("1. Standard Delivery...");
		System.out.println("2. Express Delivery...");
		System.out.println("3. SameDay Delivery...");
		System.out.println("Enter number of orders to process :: ");
		int noOfOrders = sc.nextInt();
		Order orders[] = new Order[noOfOrders];
		System.out.println("Please Enter order Details (Customer Type,Purchase Amount,Delivery Option: ");
		for (int i = 0; i < orders.length; i++) {
			orders[i] = new Order(sc.nextInt(),sc.nextDouble(),sc.nextInt());
		}
		
		OrderProcesser process = new OrderProcesser();
		for (int i = 0; i < orders.length; i++) {
			System.out.println("Processing order : "+ i);
			process.processingOrder(orders[i]);
		}
	}
	

}
