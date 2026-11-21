package com.kodewala.constructors6;

public class ElectronicProduct extends Product {
	int warranty;
	
	public ElectronicProduct() {
		super();
	}

	public ElectronicProduct(String name, int price, String productId, int _warranty) {
		super(name, price, productId); //init the default fields
		this.warranty = _warranty;
	}
	
}
