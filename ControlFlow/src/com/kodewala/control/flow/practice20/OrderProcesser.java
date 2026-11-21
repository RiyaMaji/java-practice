package com.kodewala.control.flow.practice20;

import java.util.Scanner;

public class OrderProcesser {
	DeliveryCharge dCharge = new DeliveryCharge();

	void processingOrder(Order order) {
			if (order.purchaseAmount < 500 && order.customerType != 1)
				System.out.println("Order not eligible for delivery.");
			else if (order.purchaseAmount >= 3000) {
				System.out.println("You are eligible for ₹100 cashback...");
				order.purchaseAmount += dCharge.calculateDeliveryCharge(order.deliveryOption,
						order.customerType);
				System.out.println("Purchase Amount: ₹" + order.purchaseAmount);
				System.out.println("Order Processed Successfully");
			} else {
				order.purchaseAmount += dCharge.calculateDeliveryCharge(order.deliveryOption,
						order.customerType);
				System.out.println("Purchase Amount: ₹" + order.purchaseAmount);
				System.out.println("Order Processed Successfully");
			}
	}
}
