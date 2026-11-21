package com.kodewala.oops.abstraction.p2;

public class OrderService {
	public void placeOrder(double price) {
		if(validateOrder(price)) {
			double finalPrice = calculatePrice(price);
			confirmOrder(finalPrice);
		}else
			System.out.println("Invalid Order !!!");
	}

	private void confirmOrder(double finalPrice) {
		System.out.println("Order Placed Successfully!!!...");
		System.out.println("Final Price : " + finalPrice);
	}

	private double calculatePrice(double price) {
		return price - (price * 0.10);
	}

	private boolean validateOrder(double price) {
		return price > 0;
	}

}
