package com.kodewala.array8;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		int count = 0;
		String status ;
		Scanner sc = new Scanner(System.in);
		OrderService service = new OrderService();
		Product products[] = new Product[5];
		System.out.println("Enter productId , productName ,availableStock , minimumRequiredStock : ");
		for (int i = 0; i < products.length; i++) {
			products[i] = new Product(i, sc.next(), sc.nextInt(),sc.nextInt());
		}
		for (int i = 0; i < products.length; i++) {
			status = service.orderStatus(products[i]);
			if(status.equals("Out of Stock") || status.equals("Restock Required"))
				count++;
		}
		System.out.println("The total number of products requiring restocking : " + count);
		sc.close();
	}

}
