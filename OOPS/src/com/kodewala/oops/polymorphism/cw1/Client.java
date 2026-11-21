package com.kodewala.oops.polymorphism.cw1;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TicketProcessor ticketProcessor = new TicketProcessor();
		System.out.println("Welcome to AIR India ticket Booking Service !!");
		int choice = 0;
		while(choice!=4) {
			System.out.println("1. FirstTime Customer..");
			System.out.println("2. Frequent Customer..");
			System.out.println("3. BusinessClass Customer..");
			System.out.println("4. Exit..");
			System.out.println("Please Select Customer Type : ");
			choice = sc.nextInt();
			switch(choice) {
				case 1:ticketProcessor.processTicket(new FirstTimeCustomer());
					break;
				case 2:ticketProcessor.processTicket(new FrequentCustomer());
					break;
				case 3 :ticketProcessor.processTicket(new BusinessClassCustomer());
					break;
				case 4 :System.out.println("Have a good day!!");
					break;
				default : System.out.println("Wrong Choice..");
					break;
			}
		}
		sc.close();

	}

}
