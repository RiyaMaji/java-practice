package com.kodewala.oops.ecom;

import java.util.Scanner;

public class Order extends User {

	public Order() {
		this("Guest User", "FLIP00", "BTM Bangalore", "79XXXXXXXX");
	}

	public Order(String userName, String userId, String address, String phoneNumber) {
		super(userName, userId, address, phoneNumber);

	}

	public void placeOrder(User user) {

		int orderId = 0;

		if (user.getUserId().equals("GENERICUSER")) {
			System.out.println("Please Create your Account ... ");
		} else {
			Product product = new Product();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Product Name : ");
			product.setProductName(sc.nextLine());
			System.out.println("Enter Quantity : ");
			product.setQuantity(sc.nextInt());

			if (product.quantity == 0) {
				System.out.println("Product Not Selected...");
			} else {
				ElectronicProduct electronicProduct = new ElectronicProduct(product.getProductName(),
						product.getDescription(), product.getQuantity(), product.getStatus(),false,0);
				orderId = ProcessingOrder.createOrder(electronicProduct);
				System.out.println("Order Placed!!");
				System.out.println("Order Id : " + orderId);
			}
			sc.close();
		}
	}
}
