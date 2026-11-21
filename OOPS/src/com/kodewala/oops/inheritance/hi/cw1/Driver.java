package com.kodewala.oops.inheritance.hi.cw1;

public class Driver {

	public static void main(String[] args) {
		CurrentAccount cr = new CurrentAccount("BB23214242432197");
		cr.displayCR();
		SavingAccount sa = new SavingAccount("HDFC54854343345324");
		sa.displayIR();
	}

}
