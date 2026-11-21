package com.kodewala.oops.inheritance.p3;

public class TruckDelivery extends DeliveryVehicle {
	private String loadCapacity;

	public TruckDelivery(String registrationNumber, String loadCapacity) {
		super(registrationNumber);
		this.loadCapacity = loadCapacity;
	}

	public void displayLoadCapacity() {
		registrationDisplay();
		System.out.println("TruckDelivery.displayLoadCapacity()" + loadCapacity);
	}
}
