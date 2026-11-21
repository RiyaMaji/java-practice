package com.kodewala.array1;

public class Driver {

	public static void main(String[] args) {
		User user1 = new User("Riya","7908711700");
		User user2 = new User("Riya1","7908711200");
		User user3 = new User("Riya2","7908711400");
		User user4 = new User("Riya3","7908711500");
		User user5 = new User("Riya4","7908711800");
		
		// store user objects in an array.
		User[] users = new User[5];

		users[0] = user1;
		users[1]= user2;
		users[2]= user3;
		users[3] = user4;
		users[4] = user5;
		for (int i = 0; i < users.length; i++) {
			System.out.println(users[i].name + " : "+ users[i].mobile);
		}
		
		
	}

}
