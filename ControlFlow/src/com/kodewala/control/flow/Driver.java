package com.kodewala.control.flow;

public class Driver {

	public static void main(String[] args) {
		Booking booking = new Booking();
		
		String pnr = booking.doBooking("BLR", "DEL", 5);
		
		System.out.println("PNR : "+pnr);
	}
}
