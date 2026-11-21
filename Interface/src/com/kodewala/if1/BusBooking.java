package com.kodewala.if1;

public class BusBooking implements IDiscount {

	@Override
	public int calculateDiscount(int amount, int rate) {
			return IDiscount.MAX_VALUE;

	}

	@Override
	public void calculateDiscountTax(int tax) {
		System.out.println("BusBooking.calculateDiscountTax()");
	}

}
