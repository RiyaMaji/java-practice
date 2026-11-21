package com.kodewala.array8;

public class OrderService {
	public String orderStatus(Product product) {
		String status ;
		if(product.getAvailableStock() == 0) {
			status = "Out of Stock";
			System.out.println(status +" : "+product.getProductName());
		}
		else if(product.getAvailableStock() < product.getMinimumRequiredStock()) {
			status = "Restock Required" ;
			System.out.println(status +" : "+product.getProductName());
		}
		else if(product.getAvailableStock() >= product.getMinimumRequiredStock())
			status = "Stock Available";
		else
			status = "Invalid Data!!";
		return status;
	}
}
