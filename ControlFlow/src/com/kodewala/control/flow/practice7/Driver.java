package com.kodewala.control.flow.practice7;

public class Driver {

	public static void main(String[] args) {
		Swiggy order = new Swiggy();
		int status = Integer.parseInt(args[0]);
		order.getOrderMessage(status);

	}

}
