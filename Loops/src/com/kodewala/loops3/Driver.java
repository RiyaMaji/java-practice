package com.kodewala.loops3;

public class Driver {

	public static void main(String[] args) {
		double sum;
		
		sum = addition();
		System.out.println(sum);

	}

	private static double addition() {
		double num1 = 12;
		double num2 = 14;
		double sum = 0 ;
		while(num1!=num2) {
			sum = num1+num2;
			break;	
		}
		return sum;
	}

}
