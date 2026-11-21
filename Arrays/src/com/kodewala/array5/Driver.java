package com.kodewala.array5;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		BankService service = new BankService();
		Scanner sc = new Scanner(System.in);
		Customer customers[] = new Customer[2];
		for(int i= 0;i<customers .length;i++)
			customers[i] = new Customer(sc.next(),sc.nextInt(),sc.next());
		for(int i= 0;i<customers .length;i++)
			service.checkBalance(customers[i]);

	}

}
