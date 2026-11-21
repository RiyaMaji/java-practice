package com.kodewala.oops;

public class Driver {

	public static void main(String[] args) {
		Payment payment = new Payment(120);
		payment.doCredit(1200);
		//directly modifying the data
		//payment.balance =2000;
		
		System.out.println(payment.getBalance());
		

	}

}
