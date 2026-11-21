package com.kodewala.control.flow.practice14;

public class Driver {

	public static void main(String[] args) {
		MobileRecharge pricing = new MobileRecharge();
		int plan = Integer.parseInt(args[0]); 
		double walletBalance = Double.parseDouble(args[1]);
		pricing.recharge(plan,walletBalance) ;

	}

}
