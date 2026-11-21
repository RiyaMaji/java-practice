package com.kodewala.array3;

public class Customer {
	private String customerName;
	private double orderAmount ;
	private int distanceInKm ;
	public Customer(String customerName, double orderAmount, int distanceInKm) {
		super();
		this.customerName = customerName;
		this.orderAmount = orderAmount;
		this.distanceInKm = distanceInKm;
	}
	public String getCustomerName() {
		return customerName;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public int getDistanceInKm() {
		return distanceInKm;
	}
}
