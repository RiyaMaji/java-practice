package com.kodewala.inf.p1;

public class CabBooking implements IBooking {

	@Override
	public void calculateFare() {
		System.out.println("CabBooking.calculateFare()");
	}

	@Override
	public void calculateWaitingTime() {
		System.out.println("CabBooking.calculateWaitingTime()");
	}

	@Override
	public void confirmBooking() {
		System.out.println("CabBooking.confirmBooking()");
	}

}
