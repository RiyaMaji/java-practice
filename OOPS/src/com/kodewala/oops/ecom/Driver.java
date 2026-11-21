package com.kodewala.oops.ecom;

public class Driver {

	public static void main(String[] args) {
		Order order = new Order();
		order.placeOrder(new User("Riya", "RI123", "BTM , Bangalore, India", "7908711900"));
		// "Generic","GENERICUSER","India","69XXXXXXXX"

	}

}
