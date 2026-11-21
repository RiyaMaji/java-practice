package com.kodewala.oops.inheritance.p1;

public class Product {
	private String productName;
	private double productPrice;

	public Product(String productName, double productPrice) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public void displayProduct() {
		System.out.println("Product Name :" + productName);
		System.out.println("Product Price : " + productPrice);
	}
}
