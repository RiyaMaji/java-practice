package com.kodewala.array2;

public class OrderProcessor {
	
	private double calculateFinalAmount(Product product) {
		double discount = 0;
		double orderAmount = calculateOrderAmount(product);
		System.out.println("Order Amount : " + orderAmount);
		if (orderAmount >= 5000) {
			discount = orderAmount * 0.15;
			System.out.println("Congratulations.. You are eligible for a discount of 15 % !! ");
			System.out.println("Discount value : " + discount );
		} else if (orderAmount >= 3000 && orderAmount < 5000) {
			discount = orderAmount * 0.1;
			System.out.println("Congratulations.. You are eligible for a discount of 10% !!");
			System.out.println("Discount value : " + discount );
		} else if (orderAmount >= 1000 && orderAmount < 3000) {
			discount = orderAmount * 0.05;
			System.out.println("Congratulations.. You are eligible for a discount of 5% !!");
			System.out.println("Discount value : " + discount );
		} else {
			discount = 0.0;
		}
		orderAmount -= discount;
		return orderAmount;
	}

	private double calculateOrderAmount(Product product) {
		if (product.getQuantity() < 0) {
			System.err.println("Incomplete Order! Invalid Input!!");
			return 0;
		}
		else
			return product.getPrice() * product.getQuantity();
	}
	public void placeOrder(Product product) {
		product.displayProduct();
		System.out.println("Final Cart Value : " + calculateFinalAmount(product));
	}
}
