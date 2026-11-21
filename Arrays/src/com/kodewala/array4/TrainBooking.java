package com.kodewala.array4;

public class TrainBooking {
	private String passengerName;
	private int numberOfPassengers;
	private double ticketPricePerPassenger;
	public TrainBooking(String passengerName, int numberOfPassengers, double ticketPricePerPassenger) {
		super();
		this.passengerName = passengerName;
		this.numberOfPassengers = numberOfPassengers;
		this.ticketPricePerPassenger = ticketPricePerPassenger;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}
	public double getTicketPricePerPassenger() {
		return ticketPricePerPassenger;
	}
}
