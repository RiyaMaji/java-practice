package com.kodewala.exception;

public class OrderProcessing {

	public static void main(String[] args) {
		System.out.println("OrderProcessing.main()...Start");
		OrderProcessing order = new OrderProcessing();
		try {
			order.processOrder();
		} catch (ArithmeticException e) {
			System.err.println("Number of products cannot be zero");
			e.printStackTrace();
		}
		System.out.println("OrderProcessing.main().End");
	}

	public void processOrder() {
		System.out.println("OrderProcessing.processOrder().start");
		calculateOrderAmount();
		System.out.println("OrderProcessing.processOrder().End");
	}
	public void calculateOrderAmount() {
		System.out.println("OrderProcessing.calculateOrderAmount().start");
		int totalAmount = 10000;
		int numberOfProducts = 0;
		int amountPerProduct = totalAmount / numberOfProducts;
		System.out.println(amountPerProduct);
		System.out.println("OrderProcessing.calculateOrderAmount().End");
	}

}
