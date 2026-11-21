package com.kodewala.oops.abstraction;

public class OrderService {
	// Exposed functionality
	public void placeOrder() {
		validateCustomer();
		checkProductAvailability();
		processPayment();
		updateInventory();

		System.out.println("Order placed successfully!");
	}

	private void updateInventory() {
		System.out.println("OrderService.updateInventory()");
	}

	private void processPayment() {
		System.out.println("OrderService.processPayment()");
	}

	private void checkProductAvailability() {
		System.out.println("OrderService.checkProductAvailability()");
	}

	private void validateCustomer() {
		System.out.println("OrderService.validateCustomer()");
	}

}
