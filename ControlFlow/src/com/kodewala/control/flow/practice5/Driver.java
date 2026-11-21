package com.kodewala.control.flow.practice5;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		ShoppingGift sGift = new ShoppingGift();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter purchase amount : ");
		double purchaseAmount = sc.nextDouble();
		sGift.getGift(purchaseAmount);

	}

}
