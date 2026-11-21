package com.kodewala.strings1;

public class Driver2 {

	public static void main(String[] args) {
		String s1 = "Academy"; //scp

		String s2 = new String("Academy");//scp +heap
		System.out.println(s2 == s1);
		String s3 = s1 + s2 ; //heap
		String s4 = new String("AcademyAcademy");
		System.out.println(s3 == s4);
	}

}
