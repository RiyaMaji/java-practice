package com.kodewala.control.flow.practice16;

public class Driver1 {

	public static void main(String[] args) {
		int[] transactions = {500, 1200, -200, 800, -500, 2500}; 
		for (int i = 0; i < transactions.length; i++) {
			if(transactions[i]>0)
				System.out.println((i+1) + " : Successful transaction !!!");
			else
				System.out.println((i+1) + " : Failed transaction !!!");
		}
	}

}
