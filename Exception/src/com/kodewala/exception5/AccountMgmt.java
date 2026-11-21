package com.kodewala.exception5;

public class AccountMgmt {
	void openAccount(String name, String address) 
	{
		System.out.println("AccountMgmt. openAccount() START");
		activateAccount("234567456");
		System.out.println("AccountMgmt.openAccount() END");
	}

	void activateAccount(String accNo)
	{
		System.out.println("AccountMgmt. activateAccount() START");
		try {
			checkAccountStatus("SBI1247");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("AccountMgmt.activateAccount() START");
	}
	private boolean checkAccountStatus(String accNo) throws Exception,NullPointerException 
	{   //throws---> someone calling this method pls be ready to handle this exception
		try {
			accNo.startsWith("SBI"); //NPE-->risky code
			
		} catch (NullPointerException e) {
			//throw --> create new exception object and throw it to the caller
			throw new Exception("Account Number is not starting with SBI");
		}catch (Exception e) {
			throw new Exception("Operation Failed..");
		}
		return false;
	}
}
