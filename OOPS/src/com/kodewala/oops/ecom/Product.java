package com.kodewala.oops.ecom;

public class Product {
	// Generic product details(common for all products)
	String productName;
	String description;
	int quantity;
	String status;

	public Product() {
		this("GenericProduct", "DummyProduct", 0, "Available");
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Product(String productName, String description, int quantity, String status) {
		super();
		this.productName = productName;
		this.description = description;
		this.quantity = quantity;
		this.status = status;

	}

	public String getProductName() {
		return productName;
	}

	public String getDescription() {
		return description;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getStatus() {
		return status;
	}

	public void viewProductDetails() {
		System.out.println("Product Name : " + productName);
		System.out.println("Product Details : " + description);
		System.out.println("Product Quantity : " + quantity);
		System.out.println("Product Status : " + status);
	}

}
