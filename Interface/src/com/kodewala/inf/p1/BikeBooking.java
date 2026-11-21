package com.kodewala.inf.p1;

public class BikeBooking implements IBooking {

	@Override
	public void calculateFare() {
		System.out.println("BikeBooking.calculateFare()");
	}

	@Override
	public void calculateWaitingTime() {
		System.out.println("BikeBooking.calculateWaitingTime()");

	}

	@Override
	public void confirmBooking() {
		System.out.println("BikeBooking.confirmBooking()");
	}

}
