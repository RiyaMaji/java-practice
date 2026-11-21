package com.kodewala.oops.inheritance2;

public class Product {

	// Generic product details(common for all products)
	String productName;
	String description;
	int quantity;
	String status;

	public Product(String productName, String description, int quantity, String status) {
		super();
		this.productName = productName;
		this.description = description;
		this.quantity = quantity;
		this.status = status;

	}

	public void viewProductDetails() {
		System.out.println("Product Name : " + productName);
		System.out.println("Product Details : " +description);
		System.out.println("Product Quantity : " +quantity);
		System.out.println("Product Status : " +status);
	}

}
