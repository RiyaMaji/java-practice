package com.kodewala.inf.p1;

public class AutoBooking implements IBooking {

	@Override
	public void calculateFare() {
		System.out.println("AutoBooking.calculateFare()");
	}

	@Override
	public void calculateWaitingTime() {
		System.out.println("AutoBooking.calculateWaitingTime()");

	}

	@Override
	public void confirmBooking() {
		System.out.println("AutoBooking.confirmBooking()");
	}

}
