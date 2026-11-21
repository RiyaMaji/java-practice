package com.kodewala.inf.p5;

public class Driver {

	public static void main(String[] args) {
		double amount = 1000;
		if(IOrder.validateOrder(amount)) {
			IOrder order = new OnlineOrder();
			order.placeOrder();
		}else
			System.err.println("Invalid Amount..");
			
		
	}

}
