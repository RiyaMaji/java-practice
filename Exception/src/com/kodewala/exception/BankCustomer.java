package com.kodewala.exception;

public class BankCustomer {

	public static void main(String[] args) {
		String customerName = "Riya";
		int[] accountNumbers = {1001, 1002, 1003};
		try {
			System.out.println(customerName.length());
			System.out.println(accountNumbers[5]);
		}catch(NullPointerException e) {
			System.out.println("Customer name is unavailable..");
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Invalid account index");
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
