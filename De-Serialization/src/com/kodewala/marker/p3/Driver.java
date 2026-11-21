package com.kodewala.marker.p3;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Driver {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("Cart.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ShoppingCart clonedCart = (ShoppingCart)ois.readObject();
		ois.close();
		System.out.println("Cart Id : " + clonedCart.getCartId());
		System.out.println("Customer Name : " + clonedCart.getCustomerName());
		clonedCart.displayProducts();
		
	}

}
