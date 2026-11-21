package com.kodewala.array8;

public class Product {
	private int productId;
	private String productName;
	private int availableStock;
	private int minimumRequiredStock;
	public Product(int productId, String productName, int availableStock, int minimumRequiredStock) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.availableStock = availableStock;
		this.minimumRequiredStock = minimumRequiredStock;
	}
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public int getAvailableStock() {
		return availableStock;
	}
	public int getMinimumRequiredStock() {
		return minimumRequiredStock;
	}
	
}
