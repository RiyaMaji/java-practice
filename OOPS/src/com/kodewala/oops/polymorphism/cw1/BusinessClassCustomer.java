package com.kodewala.oops.polymorphism.cw1;

public class BusinessClassCustomer extends AirlinePassenger{
	@Override
	public void doBooking() {
		System.out.println("BusinessClassCustomer.doBooking()");
	}
}
