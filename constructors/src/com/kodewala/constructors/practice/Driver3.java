package com.kodewala.constructors.practice;

class A {

	A() {
		System.out.println("A()");
	}

	A(int x) {
		System.out.println("A(int)");
	}
}

class B extends A {

	B() {
		this(20);
		System.out.println("B()");
	}

	B(int x) {
		super(x);
		System.out.println("B(int)");
	}
}

class C extends B {

	C() {
		super();
		System.out.println("C()");
	}
}

public class Driver3 {

	public static void main(String[] args) {
		new C();

	}

}
