package com.kodewala.oops.abstraction.p7;

public class RechargeService {

	public void recharge(String number, int plan) {
		if(validateMobile(number) && validate(plan)) {
			processPayment();
			activatePlan();
			System.out.println("Recharge Successful!!!");
		}
		else
			System.out.println("Invalid Recharge request!!..");
		
	}

	private void activatePlan() {
		System.out.println("Plan Activated...");
	}

	private void processPayment() {
		System.out.println("Payment Processed!!!");		
	}

	private boolean validate(int plan) {
		return plan > 0;
	}

	private boolean validateMobile(String number) {
		return number!= null && number.matches("[6-9][0-9]{9}");
	}

}
