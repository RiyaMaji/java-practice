package com.kodewala.oops.abstraction.p12;

public class InventoryService {
	private int stock = 10;
	public void placeOrder(int quantity) {
		if(checkStock(quantity)) {
			reduceStock(quantity);
			System.out.println("Order placed Successfuly!!");
		}else
			System.out.println("Insufficient Stock!!");
	}
	private void reduceStock(int quantity) {
		stock -= quantity;
	}
	private boolean checkStock(int quantity) {
		return quantity>0 && stock >= quantity;
	}
	
	public void displayStock() {
		System.out.println("Remaining stock : " + stock);
	}
}

