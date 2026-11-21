package com.kodewala.exception.practice2;

public class ShoppingApplication {

	public static void main(String[] args) {
		String cxName = "Riya";
		String productPrice = "45";
		int quantity = 2;
		System.out.println("Shopping Application Started..");
		try {
			System.out.println("Customer name length : " + cxName.length());
			int price = Integer.parseInt(productPrice);
			int totalAmount = price * quantity;
			System.out.println("Total Amount : " + totalAmount);
	}catch (NullPointerException e) {
		System.out.println("Name cannot be null..");
		e.printStackTrace();
	}catch (NumberFormatException e) {
		e.printStackTrace();
		System.out.println("Pls enter the price in correct format");
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		System.out.println("Shopping process cleanup completed..");
	}
		System.out.println("Shopping Application End..");
	}

}
