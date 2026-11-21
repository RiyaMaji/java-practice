package com.reliance.digital;

public class Driver {

	public static void main(String[] args) {
		Customer customer = new Customer("Riya");
		customer.cart.addProduct(new Product(1, "Laptop", 1500000));
		customer.cart.addProduct(new Product(2, "KeyBoard", 1500));
		customer.cart.addProduct(new Product(3, "Mouse", 987));
		customer.placeOrder();
	}

}
