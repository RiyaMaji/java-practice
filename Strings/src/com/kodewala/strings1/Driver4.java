package com.kodewala.strings1;

public class Driver4 {

	public static void main(String[] args) {
		String s = "Kodewala"; // scp
		// in case i want to change s
		s = s.concat(" Academy");
		String s2 = s.concat(" Academy"); // trying to change the object
		// Object created in heap with content Kodewala Academy
		System.out.println(s2);
		
	}

}
