package com.kodewala.array7;

public class Order {
	private int orderId;
	private String customerName;
	private double orderAmount;
	private String orderStatus;
	public Order(int orderId, String customerName, double orderAmount, String orderStatus) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.orderAmount = orderAmount;
		this.orderStatus = orderStatus;
	}
	public int getOrderId() {
		return orderId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public String getOrderStatus() {
		return orderStatus;
	}

}
