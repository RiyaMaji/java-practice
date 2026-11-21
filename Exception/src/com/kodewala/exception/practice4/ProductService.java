
package com.kodewala.exception.practice4;

public class ProductService {

	public static void main(String[] args) {
		try {
			addProduct("P101");
		} catch (DuplicateProductException e) {
			System.err.println(e.getMessage());
			System.err.println(e.getErrorCode());
			e.printStackTrace();
		}
	}

	private static void addProduct(String productId)throws DuplicateProductException 
	{
		String existingProductId = "P101";
		if(productId.equals(existingProductId))
			throw new DuplicateProductException("Product already exists!","AMZ102");
		System.out.println("Product added Successfully");
	}

}
