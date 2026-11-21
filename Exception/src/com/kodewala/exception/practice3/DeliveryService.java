package com.kodewala.exception.practice3;

public class DeliveryService {

	public static void main(String[] args) {
		try {
			checkDeliveryArea(null);
		} catch (DeliveryAreaNotInServiceException  | IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}

	}

	private static void checkDeliveryArea(String city) throws DeliveryAreaNotInServiceException {
		String serviceableArea = "Kolkata";
		if(city == null)
			throw new IllegalArgumentException("City cannot be null");
		if(!city.equalsIgnoreCase(serviceableArea) && !city.equalsIgnoreCase("Mumbai"))
			throw new DeliveryAreaNotInServiceException("Delivery is not available in " + city);
		System.out.println("Delivery Available!!!");
	}

}
