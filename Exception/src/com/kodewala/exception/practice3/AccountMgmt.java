package com.kodewala.exception.practice3;

public class AccountMgmt {

	public static void main(String[] args) {
		try {
			activateAccount(null);
		} catch (InvalidAccountException e) {
			System.err.println(e.getMessage());
		}

	}

	private static void activateAccount(String accNo) throws InvalidAccountException 
	{
		if(accNo == null)
			throw new InvalidAccountException("Account number cannot be null");
		if(!accNo.startsWith("SBI"))
			throw new InvalidAccountException("Account Number must start with SBI");
		System.out.println("Account Activated successfuly!!..");
	}

}
