package com.kodewala.oops.abstraction.p1;

public class Driver {

	public static void main(String[] args) {
		ATMService check = new ATMService();
		check.withdraw(123, 2000);
		//check.deductMoney(263);
	}

}
