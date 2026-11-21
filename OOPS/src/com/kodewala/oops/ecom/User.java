package com.kodewala.oops.ecom;

public class User {
	private String userName;
	private String userId;
	private String address;
	private String phoneNumber;
	public User() {
		this("Generic","GENERICUSER","India","69XXXXXXXX");
	}
	public User(String userName, String userId, String address, String phoneNumber) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserId() {
		return userId;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
}
