package com.kodewala.strings4;

public class Driver {

	public static void main(String[] args) {
		String s1 = "Kodewala";//scp(1 object)
		String s2 = "Academy";//scp(1 object)

		String s3 = new String("academy");    //heap(1 object) +scp(1 object)

		System.out.println(s3.equals(s2));

	}

}
