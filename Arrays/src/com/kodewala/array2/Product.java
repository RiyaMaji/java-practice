package com.kodewala.array2;

public class Product {
	private String productName;
	private double price;
	private int quantity;

	public Product(String productName, double price, int quantity) {
		super();
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}
	public void displayProduct() {
		System.out.println("Product Name : " + this.productName);
		System.out.println("Product Price : "+ this.price);
		System.out.println("Product Quantity : "+ this.quantity);
	}

}
