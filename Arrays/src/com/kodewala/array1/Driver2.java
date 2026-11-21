package com.kodewala.array1;

public class Driver2 {

	public static void main(String[] args) {
		// create an array which will store city name -- > "Bangalore'

		String cities[] = new String[5];

		// Storing the cities
		cities[0] = "Bangalore";
		cities[1] = "Chennai";
		cities[2] = "Mumbai";
		cities[3] = "Surat";
		cities[4] = "Shimla";
		
		for (int i = 0; i < cities.length; i++) {
			if(cities[i].charAt(0) == 'S')
			System.out.println(" City Starting with 'S' : " + cities[i]);
		}
		
	}

}
