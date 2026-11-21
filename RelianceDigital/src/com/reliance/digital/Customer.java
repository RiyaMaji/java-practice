package com.reliance.digital;

public class Customer {
	private String name;
	Cart cart;
	public Customer(String name) {
		super();
		this.name = name;
		cart = new Cart();
	}
	
	void placeOrder() {
		
		double total = cart.calculateTotal();
		
		System.out.println("Order Placed Successfuly for "+ name +" !!!");
		System.out.println("Order Total : " + total);
		
	}
}
