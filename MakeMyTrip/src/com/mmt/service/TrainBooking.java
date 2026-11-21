package com.mmt.service;

import java.time.LocalDateTime;

import com.mmt.model.Booking;
import com.mmt.model.SearchResult;

public class TrainBooking implements IBooking {

	@Override
	public Booking book(String name, String source, String destination) throws Exception {

		Booking booking = new Booking(name, source, destination);

		booking.setTicketPrice(350);
		booking.setBookingId("TR101");
		booking.setBookingDate(LocalDateTime.now());
		
		return booking;
	}

	@Override
	public void cancelBooking() {
		System.out.println("Train Booking Cancelled!!");
	}

	@Override
	public Booking checkStatus(Booking booking) throws Exception {
		Booking booked = booking;
		if (booking != null) 
			booking.setStatus("CONFIRMED");
		return booked;
	}

	@Override
	public SearchResult search() {
		int count = 10;
		SearchResult result = new SearchResult();
		result.setServiceName("Train");
		result.setPrice(350);
		if (count > 1) {
			result.setAvailability(true);
			count--;
		}
		else
			result.setAvailability(false);

		return result;
	}

}
