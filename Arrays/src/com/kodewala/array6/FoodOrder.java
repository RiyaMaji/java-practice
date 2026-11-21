package com.kodewala.array6;

public class FoodOrder {
	private String customerName;
	private double orderAmount;
	private int deliveryDistance;
	public FoodOrder(String customerName, double orderAmount, int deliveryDistance) {
		super();
		this.customerName = customerName;
		this.orderAmount = orderAmount;
		this.deliveryDistance = deliveryDistance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public int getDeliveryDistance() {
		return deliveryDistance;
	}

}
