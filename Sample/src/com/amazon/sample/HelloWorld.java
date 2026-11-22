package com.amazon.sample;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String args[]) {
		System.out.println("Hello World ! from Eclipse IDE...");
		int amount = 200;
		System.out.println("Amount : " + amount);
		HelloWorld.doSomething();
		Scanner sc = new Scanner(System.in);
		sc.close();
		for(int i=0;i<=7;i++) {
			if(i==4) {
				continue;
				// we cannont put break with continue;
			}
			System.out.println(i);
			
		}
	}

	public static void doSomething() {
		System.out.println("HelloWorld.doSomething()");
	}

}
