package com.kodewala.control.flow.practice9;

public class Driver {

	public static void main(String[] args) {
		CustomerSupportMenu menu = new CustomerSupportMenu();
		int option = Integer.parseInt(args[0]);
		menu.customerSupport(option);
	}

}
