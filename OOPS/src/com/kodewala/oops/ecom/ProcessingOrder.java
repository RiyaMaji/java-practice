package com.kodewala.oops.ecom;

public class ProcessingOrder {
	public static int createOrder(ElectronicProduct electronicProduct) {
		int orderId = 12;
		electronicProduct.viewElectronicProductDetails();
		return orderId;
	}
}
