package com.kodewala.strings3;

public class Driver1 {

	public static void main(String[] args) {
		String name = "Riya";
		String myName = "Riya";
		System.out.println(name == myName);

		String brand = "Samsung";
		String product = "Mobile";
		String title = brand + " " + product; // heap

		String expectedTitle = "Samsung Mobile"; // scp
		
		String titles = new String("Samsung Mobile"); // heap +scp

		System.out.println(title);
		System.out.println(title == expectedTitle);
		System.out.println(title.equals(expectedTitle));
		System.out.println(titles == expectedTitle);

	}

}
