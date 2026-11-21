package com.kodewala.control.flow.practice11;

public class Driver {

	public static void main(String[] args) {
		Myntra order = new Myntra();
		int shippingType = Integer.parseInt(args[0]);
		double orderAmount = Double.parseDouble(args[1]);
		order.calculateShipping(shippingType,orderAmount);

	}

}
