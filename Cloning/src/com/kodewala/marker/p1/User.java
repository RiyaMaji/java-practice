package com.kodewala.marker.p1;

public class User implements Cloneable {
	private int userId;
	private String username;
	Address address;

	public User(int userId, String username, Address address) {
		super();
		this.userId = userId;
		this.username = username;
		this.address = address;
	}

	public int getUserId() {
		return userId;
	}

	public String getUsername() {
		return username;
	}

	public Address getAddress() {
		return address;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		User user = (User)super.clone();
		user.setAddress((Address)address.clone());
		return user;
	}

}
