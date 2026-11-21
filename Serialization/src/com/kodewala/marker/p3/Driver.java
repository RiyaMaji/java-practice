
package com.kodewala.marker.p3;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Driver {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "Biryani", 297);
		Product product2 = new Product(2, "Soya Chaap", 274);
		Product product3 = new Product(3, "Panipuri", 200);
		
		ShoppingCart cart = new ShoppingCart(12, "Riya");
		
		cart.addProduct(product1);
		cart.addProduct(product2);
		cart.addProduct(product3);
		
		FileOutputStream fos = new FileOutputStream("Cart.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(cart);
		oos.close();
		cart.displayProducts();
		System.out.println("Cart Serialized!!");
	}

}
