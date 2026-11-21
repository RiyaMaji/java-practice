package com.kodewala.oops.inheritance.p3;

public class Driver {
	public static void main(String[] args) {
		BikeDelivery delivBikeDelivery = new BikeDelivery("ri1243781545","850CC");
		delivBikeDelivery.mileageDisplay();
		
		TruckDelivery delTruckDelivery = new TruckDelivery("mjh23559067", "1000P");
		delTruckDelivery.displayLoadCapacity();
	}
}
