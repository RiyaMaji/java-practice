package com.kodewala.control.flow.practice7;

public class Swiggy {

	public void getOrderMessage(int status) {
		switch (status) {
		case 1:
			System.out.println("Order Placed");
			break;
		case 2:
			System.out.println("Restaurant Accepted");
			break;
		case 3:
			System.out.println("Food Being Prepared");
			break;
		case 4:
			System.out.println("Out for Delivery");
			break;
		case 5:
			System.out.println("Delivered");
			break;
		case 6:
			System.out.println("Cancelled");
			break;
		default:
			System.out.println("Wrong Input..");
			break;
		}
		
	}

}
