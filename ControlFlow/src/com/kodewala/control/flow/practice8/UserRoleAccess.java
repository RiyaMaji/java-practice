package com.kodewala.control.flow.practice8;

public class UserRoleAccess {

	public void checkAccess(int role) {
		switch (role) {
		case 1:
			System.out.println("Admin → Full Access");
			break;
		case 2:
			System.out.println("Manager → Management Access");
			break;
		case 3:
			System.out.println("Developer → Development Access");
			break;
		case 4:
			System.out.println("Tester → Testing Access");
			break;
		case 5:
			System.out.println("Guest → Read Only");
			break;
		default:
			System.err.println("Access Denied!!!");
			break;
		}
		
	}

}
