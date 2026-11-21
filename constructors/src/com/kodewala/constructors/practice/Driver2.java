package com.kodewala.constructors.practice;

class Parent1 {

	int x = 10;

	Parent1() {
		System.out.println("Parent1 x = " + x);
	}
}

class Child1 extends Parent1 {

	int x = 20;

	Child1() {
		System.out.println("Child1 x = " + x);
		System.out.println("Parent1 x = " + super.x);
	}
}

public class Driver2 {

	public static void main(String[] args) {
		new Child1();
	}
}
