package com.kodewala.inf2;

public class FlightBooking implements IBooking {
	@Override
	public Booking book() {
		return null;
	}

	@Override
	public void cancelBooking() {
	}

	@Override
	public Booking checkStatus() {
		return null;
	}

	@Override
	public SearchResult search() {
		return null;
	}
	public static void print() {
		IBooking.print();
		   System.out.println("IBooking.print()...Flight");
	   }

}
