package com.kodewala.exception.practice3;

public class BankingApplication {

	public static void main(String[] args) {
		try {
			validAccount(null);
		}catch (InvalidAccountException | NullPointerException e) {
			System.out.println(e.getMessage());
		}

	}
	static void validAccount(String accountNumber) throws InvalidAccountException,NullPointerException
	{
		if(accountNumber == null)
			throw new NullPointerException("Account number cannot be null");
		if(!accountNumber.startsWith("SBI"))
			throw new InvalidAccountException("This is an invalid account number.."+accountNumber);
		System.out.println("Account Validated Successfuly!!!");	
	}
}
