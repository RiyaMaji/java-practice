package com.kodewala.exception.practice1;

public class PaymentGateway {

	public static void main(String[] args) {
		try {
			int paymentAmount = Integer.parseInt(args[0]);
			System.out.println("Payment Amount : " + paymentAmount);
		} catch (NumberFormatException e) {
			System.err.println("Invalid Payment Amount format");
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Pls Provide the amount again...");
			e.printStackTrace();
		}
		catch (Exception e) {
			System.err.println("Payment processing Failed..");
			e.printStackTrace();
		}finally {
			System.out.println("Payment gateway execution completed");
		}
	}

}
