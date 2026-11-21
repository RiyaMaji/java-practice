package com.kodewala.oops.inheritance.p7;

public class ExpressDelivery extends Delivery{
	@Override
	public double calculateCharge() {
		return distance*10;
	}
	public void displayCharge() {
		System.out.println("Charge :" + calculateCharge());
	}
}
