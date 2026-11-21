package com.kodewala.exception.practice4;

public class ShoppingCart {

	public static void main(String[] args) {
		try {
			addToCart("Laptop",1);
		} catch (MinQuantityFaultException e) {
			System.err.println(e.getMessage());
		}

	}

	private static void addToCart(String productName, int quantity) throws MinQuantityFaultException
	{
				if(quantity <1)
					throw new MinQuantityFaultException("Minimum quantity must be 1");
				System.out.println(productName + " added to cart..");
	}


}
