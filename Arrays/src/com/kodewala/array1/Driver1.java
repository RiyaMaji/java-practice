package com.kodewala.array1;

import java.util.Iterator;

public class Driver1 {

	public static void main(String[] args) {
		//Create an array which will hold 5 integers
		int productIds[] = new int[5];//creating an array
		
		//add an elements
		productIds[0] = 100 ;
		productIds[1] = 77 ;
		productIds[2] = 23 ;
		productIds[3] = 90 ;
		productIds[4] = 12 ;
		
		for (int j = 0; j < productIds.length; j++) {
			System.out.println(productIds[j]);
		}
		
	}

}
