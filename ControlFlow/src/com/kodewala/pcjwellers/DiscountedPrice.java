package com.kodewala.pcjwellers;

public class DiscountedPrice {
	void finalPrice(double pValue, String cxType) {
		Discount discount = new Discount();
		switch (cxType) {
		case "Regular": 
			discount.appliedDiscount(pValue,0.05);
			break;
		case "Silver": 
			discount.appliedDiscount(pValue,0.1);
			break;
		case "Gold": 
			discount.appliedDiscount(pValue,0.2);
			break;
		default:
			System.out.println("Cx type can be Gold/Silver/Regular only..");
			break;
		}
	}
}
