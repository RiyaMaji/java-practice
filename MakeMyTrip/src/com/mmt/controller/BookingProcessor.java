package com.mmt.controller;

import com.mmt.model.Booking;
import com.mmt.service.IBooking;

public class BookingProcessor {
	public Booking processBooking(String name,String source,String destination,IBooking booking) throws Exception {
		
		System.out.println("Processing Booking....");
		Booking result = booking.book(name,source,destination);
		System.out.println("Booking Id : " + result.getBookingId());
		if(booking.checkStatus(result).getStatus() == "CONFIRMED")
			System.out.println("Train booking Successful!!!");
		
		return result;
	}
}
