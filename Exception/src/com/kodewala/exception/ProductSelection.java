package com.kodewala.exception;
//Array indexes start from 0. For an array of length 5, valid indexes are 0–4
public class ProductSelection {

	public static void main(String[] args) {
		int[] productIds = {101, 102, 103, 104, 105};
		int selectedIndex = 7;
		try {
			System.out.println("Selected Product: " + productIds[selectedIndex]);
			System.out.println("Product selected successfully");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Invalid product selection");
			e.printStackTrace();
		}
		System.out.println("Shopping process completed");
	}

}
