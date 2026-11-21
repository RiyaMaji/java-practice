package com.kodewala.marker.p1;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("Vellore", "Chennai", "India");
		User user = new User(4, "Rishita", address);
		User clonedUser = (User)user.clone();
		System.out.println(clonedUser.getUserId());
		System.out.println(clonedUser.getUsername());
		System.out.println(clonedUser.getAddress().getCity());
		
		user.address.setCity("Madurai");
		
		System.out.println(user.getAddress().getCity());
		System.out.println(clonedUser.getAddress().getCity());
		

	}

}
