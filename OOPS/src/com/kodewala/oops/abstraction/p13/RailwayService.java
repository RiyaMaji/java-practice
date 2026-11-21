package com.kodewala.oops.abstraction.p13;

public class RailwayService {
	private int availableSeats = 3 ;
	public void bookTicket() {
		if(checkAvailability()) {
			allocateSeat();
			generateTicket();
		}else
			System.out.println("No seats available!!");
	}
	private void generateTicket() {
		System.out.println("Ticket Booked Successfully!!");
	}
	private void allocateSeat() {
		availableSeats --;
	}
	private boolean checkAvailability() {
		return availableSeats > 0;
	}
}
