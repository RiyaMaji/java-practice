package com.kodewala.oops.abstraction.p3;

public class FoodDeliveryService {
	public void orderFood() {
		if(checkRestaurant()) {
			prepareFood();
			assignDeliveryPartner();
			System.out.println("Food Delivered Successfully");
		}else
			System.out.println("Restuarant Currently Unavailable!!!..");
	}

	private void assignDeliveryPartner() {
		System.out.println("Delivery Partner Assigned !!!");		
	}

	private void prepareFood() {
		System.out.println("Food is Ready !!!");
	}

	private boolean checkRestaurant() {
		return false;
	}
}
