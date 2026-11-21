package com.kodewala.oops.polymorphism1;
class User{
	int x =1;
}
class AdminUser extends User{ // AdminUser IS-A type of User
	int x = 10;
}
public class Driver {

	public static void main(String[] args) {
		//User u1 = new User(); // User class is referring User class object.
		AdminUser au1 = new AdminUser();
		
		
		System.out.println(au1.x);
		
		User au2 = new AdminUser(); // Parent class can refer child class object --> auto upcasting or auto boxing
		System.out.println(au2.x);  //Overriding not possible on variable
		
		//child class referring parent class object --> downcasting
		//AdminUser au = (AdminUser) new User(); or AdminUser au4 = (AdminUser)u1;  --> wrong way of downcasting
		//parent class whom we want to downcast should refer child class
		//AdminUser au3 = (AdminUser)au2;
		
	}

}
