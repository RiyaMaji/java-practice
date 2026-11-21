package com.kodewala.pcjwellers;

public class Discount {
	static final double MAXDISCOUNT = 2500.0f;
	void appliedDiscount(double pValue,double dPercent) {
		double discount = pValue * dPercent;
		if (discount < MAXDISCOUNT) {
			pValue -= discount;
			System.out.println(dPercent *100 + "% discount applied!!!");
			System.out.println("Final Price :: " + pValue);
		}
		else {
			pValue -= MAXDISCOUNT;
			System.out.println("Maximun Discount applied!!!");
			System.out.println("Final Price :: " + pValue);
		}
	}

}
