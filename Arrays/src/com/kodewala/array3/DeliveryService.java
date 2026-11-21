package com.kodewala.array3;

public class DeliveryService {
	public void placeOrder(Customer customer) {
		if(customer.getDistanceInKm() <= 10) {
			System.out.println("Customer : " + customer.getCustomerName());
			System.out.println("Order Amount : " + customer.getOrderAmount());
			checkDeliveryEligibility(customer);
		}
		else
			System.err.println("Delivery is available only within 10 km");
	}
	private void checkDeliveryEligibility(Customer customer) {
		double deliveryCharge = 0;
		String status = "Eligible for Delivery";
		if(customer.getOrderAmount() > 499) {
			System.out.println("Deliver Charge : " + deliveryCharge);
			System.out.println(status);
		}
		else if(customer.getOrderAmount() >= 149 && customer.getOrderAmount() <= 499) {
			deliveryCharge = 30;
			System.out.println("Deliver Charge : " + deliveryCharge);
			System.out.println(status);
		}
		else {
			status = "Minimum order value is rs 149!!";
			System.err.println(status);
		}			
	}
}
