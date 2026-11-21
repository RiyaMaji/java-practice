package com.kodewala.inf5;

public class User implements Cleanable{
	private String userId;
	private String name;
	public User(String userId, String name) {
		super();
		this.userId = userId;
		this.name = name;
	}
	public String getUserId() {
		return userId;
	}
	public String getName() {
		return name;
	}
}
