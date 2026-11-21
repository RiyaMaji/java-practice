package com.kodewala.exception7;

public class TicketBooking {

	public static void main(String[] args) {
		try {
		bookTicket(12);
		}catch(MaximumTicketLimitException e) {
			e.printStackTrace();
		}
	}

	private static void bookTicket(int noOfTicket) {
		
			if(noOfTicket > 10)
				throw new MaximumTicketLimitException("Single user cannot book more than 10 tickets");
			System.out.println("Tickets booked for " + noOfTicket);
		
		
	}

}
