package com.kodewala.oops.abstraction.p2;

public class Driver {

	public static void main(String[] args) {
		OrderService orderService = new OrderService();
		orderService.placeOrder(4500);

	}

}
