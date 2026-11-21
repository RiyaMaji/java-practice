package com.reliance.digital;

import java.util.ArrayList;

public class Cart {
	ArrayList<Product> productList = new ArrayList<>();
	void addProduct(Product product) {
		productList.add(product);
	}
	double calculateTotal() {
		double total = 0;
		for (Product product : productList) {
			total += product.getPrice();
		}
		return total;
	}
}
