package com.kodewala.inf.p14;

public class UPIPayment implements IPayment,IAdvancedPayment {

	@Override
	public void pay() {
		System.out.println("UPIPayment.pay()");
	}

	@Override
	public void applyCashback() {
		System.out.println("UPIPayment.applyCashback()");	
	}

}
