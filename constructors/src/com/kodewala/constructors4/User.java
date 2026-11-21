package com.kodewala.constructors4;

class SuperUser extends Object{
	SuperUser(int age){
		super(); //calling super class no args constructor
		//execute remaining steps if any
		//...
	}
}
public class User extends SuperUser{
	String userName;
	String userId;
	String mobile;
	
	User(String _userName,String _userId,String _mobile)
	{
		super(30); //calling super class constructor without argumnets
		//first line of constructor is either super or this.If we are not writing super or this then compiler will consider super with no arg i.e.super()
		this.userName=_userName;
		this.userId=_userId;
		this.mobile=_mobile;
	}
}
