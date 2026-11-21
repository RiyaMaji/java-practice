package com.kodewala.constructors.practice;

class Request {

	Request() {
		this("/", "GET", 30);
	}

	Request(String endPoint) {
		this(endPoint, "GET", 30);
	}

	Request(String endPoint, String method, int timeOut) {
		System.out.println("End Point : " + endPoint);
		System.out.println("Method : " + method);
		System.out.println("Time Out : " + timeOut);
	}
}

public class Driver10 {
	public static void main(String[] args) {
		new Request("/users");
	}

}
