package com.kodewala.constructors5;

public class User {
	String name;
	String type;
	String country;
	
	public User() {
		//system is setting / init default user
		this("User123","guest_user","India"); //Calling user class constructor
	}
	User(String _name,String _type,String _country){
		this.name = _name;
		this.type = _type;
		this.country=_country;
	}

}
