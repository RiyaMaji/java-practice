package com.kodewala.exception.practice1;

public class OrderProcessing {

	public static void main(String[] args) {
		int[] productPrices = {1200,520,320,785,7845,142};
		int productIndex = 5;
		int quants = 0;
		try {
			int productPrice = productPrices[productIndex] ;
			int orderAmount = productPrice * quants;
			System.out.println("Product Price : " + productPrice);
			
			System.out.println("Order Amount : "+ orderAmount);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Provided index is not reachable..");
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
