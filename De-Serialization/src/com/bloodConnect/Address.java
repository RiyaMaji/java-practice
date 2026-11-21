package com.bloodConnect;

import java.io.Serializable;

public class Address implements Cloneable,Serializable{

	private static final long serialVersionUID = 1L;
	private String city;
	private String state;
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
