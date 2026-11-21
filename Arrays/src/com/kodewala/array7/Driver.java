package com.kodewala.array7;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		Order orders[] = new Order[5];
		OrderService orderService = new OrderService();
		System.out.println("Enter OrderId,customerName,orderAmount,orderStatus: ");
		for (int i = 0; i < orders.length; i++) {
			orders[i] = new Order(i, sc.next(), sc.nextInt(), sc.next());
		}
		for (int i = 0; i < orders.length; i++) {
			System.out.println(orderService.orderStatus(orders[i]));
			if(orderService.orderStatus(orders[i]).equalsIgnoreCase("Order Cancelled!!"))
				count++;
		}
		System.out.println("Cancelled orders count : " + count);
		sc.close();
	}

}
