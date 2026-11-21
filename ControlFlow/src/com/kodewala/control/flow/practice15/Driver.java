package com.kodewala.control.flow.practice15;

public class Driver {

	public static void main(String[] args) {
		Insurance ins = new Insurance();
		int vehicleType = Integer.parseInt(args[0]);
		int age = Integer.parseInt(args[1]);
		ins.calculatePremium(vehicleType,age);

	}

}
