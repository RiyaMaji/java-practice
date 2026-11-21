package com.kodewala.exception.practice3;

public class OrderManagement {

	public static void main(String[] args) {
		try {
			placeOrder();
		} catch (ProductNotAvailableException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}

	private static void placeOrder() throws ProductNotAvailableException{
		checkProductavailability();
	}

	private static void checkProductavailability() throws ProductNotAvailableException{
		boolean available = true;
		if(!available)
			throw new ProductNotAvailableException("Currently Product is not Available!!!");
		System.out.println("Order Placed Successfuly");

		
	}

}
