package com.kodewala.hotstar;

public class Driver {

	public static void main(String[] args) 
	{
		for (int i=0; i < 100; i++) 
		{ 	
			//100 users are using the application
			User user = new User("guest", "free");
		}
		
		System.out.println("Total Live Users are : " + User.liveUserCount);
	}

}
