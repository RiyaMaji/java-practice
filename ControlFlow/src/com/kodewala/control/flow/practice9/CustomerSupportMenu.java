package com.kodewala.control.flow.practice9;

public class CustomerSupportMenu {

	public void customerSupport(int option) {
		switch (option) {
		case 1: 
			System.out.println("Track Order");
			break;
		case 2: 
			System.out.println("Cancel Order");
			break;
		case 3: 
			System.out.println("Return Product");
			break;
		case 4: 
			System.out.println("Request Refund");
			break;
		case 5: 
			System.out.println("Contact Support");
			break;
		default:
			System.err.println("Wrong option...Please select between[1-5]..");
			break;
		}		
	}

}