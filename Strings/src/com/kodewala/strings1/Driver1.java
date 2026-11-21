package com.kodewala.strings1;
class User{
	public User(String firstName) {
		super();
		this.firstName = firstName;
	}

	String firstName;
}
public class Driver1 {

	public static void main(String[] args) {
		String city1 = "Bangalore" ;  //One object created
		String city2 = "Bangalore"; // use the existing -- > abc123
		String city3 = "Bangalore"; // use the existing -- > abc123
		String city4 = "Bangalore"; // use the existing -- > abc123
		System.out.println( city1 == city2);
		System.out.println(city1.equals(city2));
		User user1 = new User("Kodewala");
		User user2 = new User("Kodewala");
		System.out.println(user1.equals(user2));
		User user3 = new User(city1);
		User user4 = new User(city4);
		System.out.println(city3.equals(city4));
	}

}
