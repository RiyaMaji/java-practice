package com.kodewala.control.flow.practice20;

public class DeliveryCharge {
	static double calculateDeliveryCharge(int deliveryOption,int customerType ) {
		double deliveryCharge = 0;
		switch(deliveryOption) {
		case 1 : {
			if(customerType == 1)
				deliveryCharge = 0;
			else
				deliveryCharge = 45;
			System.out.println("Delivery Charge: ₹" + deliveryCharge);
		}
			break;
		case 2 :{
			deliveryCharge = 100;
			System.out.println("Delivery Charge: ₹" + deliveryCharge);
			break;
		}
		case 3:{
			deliveryCharge = 200;
			System.out.println("Delivery Charge: ₹" + deliveryCharge);
			break;
		}
		default :
			System.out.println("Wrong delivery option...");
			break;
		}
		return deliveryCharge;
	}
}
