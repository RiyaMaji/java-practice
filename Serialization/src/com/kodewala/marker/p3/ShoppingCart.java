package com.kodewala.marker.p3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements Serializable{
	private static final long serialVersionUID = 1L;
	private int cartId;
	private String customerName;
	private List<Product> listofProducts = new ArrayList<>();
	public ShoppingCart(int cartId, String customerName) {
		super();
		this.cartId = cartId;
		this.customerName = customerName;
	}
	public int getCartId() {
		return cartId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void addProduct(Product product) {
		listofProducts.add(product);
	}
	public void displayProducts() {
		for(Product product : listofProducts) {
			System.out.println("Product Id : " + product.getProductId());
			System.out.println("Product Name : " + product.getProductName());
			System.out.println("Product Price : " + product.getPrice());
		}
	}
	
}
