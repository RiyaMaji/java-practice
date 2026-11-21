package com.kodewala.oops.abstraction.p10;

public class Driver {

	public static void main(String[] args) {
		PasswordService service = new PasswordService();
		service.changePassword("old1234", "DFGH1234");

	}

}
