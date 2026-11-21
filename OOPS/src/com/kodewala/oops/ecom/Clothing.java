package com.kodewala.oops.ecom;

public class Clothing extends Product {
	private char size;
	private String materialColor;
	private String materialType;

	public Clothing() {
		this("Clothing", "Plain Cloth", 1, "Available", 'M', "Orange", "Silk");
	}

	public Clothing(String productName, String description, int quantity, String status, char size,
			String materialColor, String materialType) {
		super(productName, description, quantity, status);
		this.size = size;
		this.materialColor = materialColor;
		this.materialType = materialType;
	}

	public char getSize() {
		return size;
	}

	public String getMaterialColor() {
		return materialColor;
	}

	public String getMaterialType() {
		return materialType;
	}

	public void viewClothingProductDetails() {
		System.out.println("Clothing Product Details : ");
		viewProductDetails();
		System.out.println("Material Type : " + getMaterialType());
		System.out.println("Material Color : " + getMaterialColor());
		System.out.println("Material Size : " + getSize());
	}

}
