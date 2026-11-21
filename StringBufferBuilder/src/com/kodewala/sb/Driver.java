package com.kodewala.sb;

public class Driver {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Kodewala");  //String Builder object --> mutable
		for (int i = 0; i < 10; i++) {
			sb.append(" Academy" + i); // same object is being modified. now new object created.
		}
		
		System.out.println(sb);
	}

}
