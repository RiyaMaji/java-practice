package com.kodewala.array3;

public class Driver {

	public static void main(String[] args) {
		DeliveryService deliveryService = new DeliveryService();
		deliveryService.placeOrder(new Customer("Riya",600,9));

	}

}
