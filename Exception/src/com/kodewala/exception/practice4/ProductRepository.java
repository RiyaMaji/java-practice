package com.kodewala.exception.practice4;

public class ProductRepository {

	public static void main(String[] args) {
		try {
			fetchProduct();
		} catch (InternalServerException e) {
			System.out.println(e.getMessage());
			System.out.println("Technical Reason : " + e.getCause());
		}

	}

	private static void fetchProduct() throws InternalServerException {
		try {
			int result = 10/0;
		}catch(ArithmeticException e) {
			throw new InternalServerException("Unable to fetch Product", e);
		}
		
		
	}

}
