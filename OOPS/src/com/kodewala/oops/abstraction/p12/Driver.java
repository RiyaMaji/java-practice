package com.kodewala.oops.abstraction.p12;

public class Driver {

	public static void main(String[] args) {
		InventoryService service = new InventoryService();
		service.placeOrder(2);
		service.displayStock();
		
		service.placeOrder(20);
		service.displayStock();
	}

}
