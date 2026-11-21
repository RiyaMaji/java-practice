package com.kodewala.array6;

public class Driver {

	public static void main(String[] args) {
		OrderService service = new OrderService();
		service.calculateDeliveryCharge(new FoodOrder("Riya", 500, 12));

	}

}
