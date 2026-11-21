package com.kodewala.oops.inheritance.p3;

public class DeliveryVehicle {
	private String registrationNumber;

	public DeliveryVehicle(String registrationNumber) {
		super();
		this.registrationNumber = registrationNumber;
	}

	public void registrationDisplay() {
		System.out.println("DeliveryVehicle.registrationDisplay()" + registrationNumber);
	}
}
