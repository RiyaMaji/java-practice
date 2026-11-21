package com.kodewala.constructors.practice;

class Parent {

	Parent() {
		System.out.println("Parent constructor");
		print();
	}

	void print() {
		System.out.println("Parent print");
	}
}

class Child extends Parent {

	Child() {
		System.out.println("Child constructor");
	}

	@Override
	void print() {
		System.out.println("Child print");
	}
}

public class Driver1 {
	public static void main(String[] args) {
		new Child();
	}
}
