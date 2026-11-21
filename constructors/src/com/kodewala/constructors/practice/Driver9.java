package com.kodewala.constructors.practice;
/**
 * Payment System — Different Parent Constructor
 */
class Payment{
	Payment(){
		System.out.println("Payment Initialized....");
	}
	Payment(String transactionId){
		this();
		System.out.println("Transaction Id : "+ transactionId);
	}
}
class UPIPayment extends Payment{
	UPIPayment(String transactionId){
		super(transactionId);
		System.out.println("UPI Payment done!!!");
	}
}
public class Driver9 {

	public static void main(String[] args) {
		UPIPayment pay1 = new UPIPayment("UI123");
	}

}
