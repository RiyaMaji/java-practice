package com.kodewala.oops.rev.polymorphism1;

public class Driver {

	public static void main(String[] args) {
		DeliveryProcessor deliveryProcessor = new DeliveryProcessor();
		deliveryProcessor.processDelivery(new EKart());

	}

}
