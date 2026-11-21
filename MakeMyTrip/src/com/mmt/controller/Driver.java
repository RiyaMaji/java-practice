package com.mmt.controller;

import java.util.Scanner;

import com.mmt.service.IBooking;
import com.mmt.service.TrainBooking;

public class Driver {

	public static void main(String[] args) throws Exception {
		
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter Passenger Name:");
         String name = sc.nextLine();

         System.out.println("Enter Source:");
         String source = sc.nextLine();

         System.out.println("Enter Destination:");
         String destination = sc.nextLine();

		IBooking tBooking = new TrainBooking();
		
		BookingProcessor processor = new BookingProcessor();
		
		processor.processBooking(name,source,destination,tBooking);
		sc.close();
	}

}
