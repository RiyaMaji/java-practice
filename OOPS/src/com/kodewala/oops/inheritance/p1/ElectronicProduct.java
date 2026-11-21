package com.kodewala.oops.inheritance.p1;

public class ElectronicProduct extends Product {
	private int warrantyPeriod;

	public ElectronicProduct(String productName, double productPrice, int warrantyPeriod) {
		super(productName, productPrice);
		this.warrantyPeriod = warrantyPeriod;
	}

	public void displayDetails() {
		displayProduct();
		System.out.println("Product Warranty : " + warrantyPeriod);
	}

}
