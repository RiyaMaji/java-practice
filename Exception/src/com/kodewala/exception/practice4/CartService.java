package com.kodewala.exception.practice4;

public class CartService {

	public static void main(String[] args) {
		try {
			validateQuantity(5);
		} catch (MaximumQuantityFaultException e) {
			System.err.println(e.getMessage());
		}

	}

	private static void validateQuantity(int quantity)throws MaximumQuantityFaultException{
		if(quantity > 5)
			throw new MaximumQuantityFaultException("Maximum 5 products are allowed!!");
		System.out.println("Quantity accepted..");
	}

}
