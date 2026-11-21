package com.kodewala.control.flow.practice8;

public class Driver {

	public static void main(String[] args) {
		UserRoleAccess userRole = new UserRoleAccess();
		int role = Integer.parseInt(args[0]);
		userRole.checkAccess(role);
	}

}
