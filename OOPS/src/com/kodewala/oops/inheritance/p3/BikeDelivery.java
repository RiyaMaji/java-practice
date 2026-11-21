package com.kodewala.oops.inheritance.p3;

public class BikeDelivery extends DeliveryVehicle {
	private String mileage;

	public BikeDelivery(String registrationNumber, String mileage) {
		super(registrationNumber);
		this.mileage = mileage;
	}

	public void mileageDisplay() {
		registrationDisplay();
		System.out.println("BikeDelivery.mileageDisplay()" + mileage);
	}
}
