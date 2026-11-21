package com.kodewala.constructors.practice;
/**
 * Requirements:
*  User constructor accepts username.
*  RegisteredUser accepts username and user ID.
*  Admin accepts username, user ID and role.
*  Use constructor chaining correctly.
 */
class User{
	User(String userName){
		System.out.println("User Name : " + userName);
	}
}
class RegisteredUser extends User{
	RegisteredUser(String userName,int userId){
		super(userName);
		System.out.println("Registered User Id :" + userId );
	}
}
class Admin extends RegisteredUser{
	Admin(String userName,int userId,String userRole){
		super(userName,userId);
		System.out.println("Role : " + userRole);
	}
}
public class Driver8 {

	public static void main(String[] args) {
		new Admin("riya", 101, "ADMIN");
	}

}
