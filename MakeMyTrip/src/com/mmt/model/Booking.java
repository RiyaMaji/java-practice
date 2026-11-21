package com.mmt.model;

import java.time.LocalDateTime;

public class Booking {
	private String BookingId;
	private String passengerName;
	private String source;
	private String destination;
	private String status;      //availabilty
	private double ticketPrice;    //price
	private LocalDateTime bookingDate;
	public Booking() {
		
	}
	public Booking(String passengerName, String source, String destination) throws Exception {
		super();
		if(passengerName == null || passengerName.isEmpty())
			throw new IllegalAccessException("Please Provide the passenger name !!!");
		if(source == null || source.isEmpty())
			throw new IllegalAccessException("Source not selected !!!");
		if(destination == null || destination.isEmpty())
			throw new IllegalAccessException("Destination not selected !!!");
		this.passengerName = passengerName;
		this.source = source;
		this.destination = destination;
	}
	
	public String getBookingId() {
		return BookingId;
	}
	public void setBookingId(String bookingId) {
		BookingId = bookingId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		if(ticketPrice<0)
			throw new IllegalArgumentException("Invalid Fair!!");
		this.ticketPrice = ticketPrice;
	}
	public LocalDateTime getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDateTime bookingDate) {
		this.bookingDate = bookingDate;
	}
}
