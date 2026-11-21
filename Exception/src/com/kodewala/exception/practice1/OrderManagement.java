package com.kodewala.exception.practice1;

public class OrderManagement {

	public static void main(String[] args) {
		OrderManagement order = new OrderManagement();
		order.placeOrder();
	}

	private void placeOrder() {
		System.out.println("OrderManagement.placeOrder()..start");
		calculateOrderAmount();
		System.out.println("Order Management End");
	}

	private void calculateOrderAmount() {
		System.out.println("OrderManagement.calculateOrderAmount().Start");
		calculateDiscount();
		System.out.println("OrderManagement.calculateOrderAmount().End");
		
	}

	private void calculateDiscount() {
		System.out.println("OrderManagement.calculateDiscount().start");
		try {
			String name = "Riya";
			System.out.println(name.length());
		}catch(NullPointerException e) {
			System.err.println("Cx name cannot be null...");
			e.printStackTrace();
		}
		System.out.println("OrderManagement.calculateDiscount().End");
		
	}

}
