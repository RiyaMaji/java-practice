package com.kodewala.cf.task1;

public class DiscountModule {
	public double discountStatus(double fair) {
		String message = null;
		double discount =0.0f;
		if(fair <= 5000) {
			message = "Discount Not Applicaple" ;
			System.err.println(message);
		}
		else if(fair > 5000 && fair <= 10000) {
			discount = fair*0.1;
			fair = fair - discount ;
			message = "Yo ho !! 10% Discount Applied..." ;
			System.out.println(message);
		}
		else if(fair > 10000 && fair <= 15000){
			discount = fair*0.15;
			fair = fair - discount ;
			message = "Yo ho !! 15% Discount Applied..." ;
			System.out.println(message);
		}
		else {
			discount = 1250;
			fair = fair - discount ;
			message = "Yo ho !! Discount of Rs.1250 received..." ;
			System.out.println(message);
		}
		return fair;
	}
}
