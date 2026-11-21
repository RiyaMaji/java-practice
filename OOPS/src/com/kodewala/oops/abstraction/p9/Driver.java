package com.kodewala.oops.abstraction.p9;

public class Driver {

	public static void main(String[] args) {
		ElectricityService service = new ElectricityService();
		service.generateBill(500);
	}

}
