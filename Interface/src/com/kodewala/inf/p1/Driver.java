package com.kodewala.inf.p1;

public class Driver {

	public static void main(String[] args) {
		IBooking booking = new BikeBooking();
		booking.calculateFare();
		booking.calculateWaitingTime();
		booking.confirmBooking();
		
		booking = new AutoBooking();
		booking.calculateFare();
		booking.calculateWaitingTime();
		booking.confirmBooking();
	}

}
