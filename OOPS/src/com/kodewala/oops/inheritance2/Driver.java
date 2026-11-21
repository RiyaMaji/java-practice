package com.kodewala.oops.inheritance2;

public class Driver {

	public static void main(String[] args) {
		Product product = new Product("Saree", "Kanjeevaram Saree", 2, "Available");
		product.viewProductDetails();
		Clothing order = new Clothing();
		order.viewClothingProductDetails();
		Clothing order2 = new Clothing("Saree", "Kanjeevaram Saree", 2, "Available");
		order2.viewClothingProductDetails();

	}

}
