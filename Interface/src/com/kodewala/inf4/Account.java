package com.kodewala.inf4;

public class Account implements Cloneable // giving permission so that object of this class can be cloned
{
	String name;
	String address;
	String accNo;

	public Account(String name, String address, String accNo) {
		super();
		this.name = name;
		this.address = address;
		this.accNo = accNo;

	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
