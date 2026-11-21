package com.kodewala.exception.practice3;

public class PaymentGateway {

	public static void main(String[] args) {
		
		try {
			processPayment(100);
		} catch (PaymentProcessingException e) {
			System.err.println(e.getMessage());
			System.err.println(e.getCause());
		}

	}

	private static void processPayment(int amount) throws PaymentProcessingException {
		
		try {
			int result = amount/0;
			System.out.println(result);
		} catch (ArithmeticException e) {
			throw new PaymentProcessingException("Payment Processing failed ..Pls try again later " ,e);
		}
	}

}
