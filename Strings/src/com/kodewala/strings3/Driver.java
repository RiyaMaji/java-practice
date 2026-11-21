package com.kodewala.strings3;

public class Driver {

	public static void main(String[] args) {
		        String name = "Rahul";    //scp
		        String anotherName = name; //scp + heap

		        name = "Amit";

		        System.out.println(name);
		        System.out.println(anotherName);

	}

}
