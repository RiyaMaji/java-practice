package com.kodewala.control.flow.practice;

public class EcommDel {
	public double calculateDeliveryCharge(double orderAmount) {
		double deliveryCharge ;
			if(orderAmount >= 2000) {
				deliveryCharge = 0.0f;
				System.out.println("Hurray!!! You are eligible for free delivery....");
				return orderAmount;
			}
			else if(orderAmount >=1000 || orderAmount <= 1999) {
				deliveryCharge = 50;
				orderAmount += deliveryCharge;
				System.out.println("Rs.50 delivery charge applied!! ");
				return orderAmount;
			}
			else {
				deliveryCharge = 100;
				orderAmount += deliveryCharge;
				System.out.println("₹100 delivery charge applied!!!  ");
			}
			return orderAmount;
	}
}
