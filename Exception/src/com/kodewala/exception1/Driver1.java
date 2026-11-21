package com.kodewala.exception1;

public class Driver1 {

	public static void main(String[] args) {
		Account account = new Account();
		String accNo = "SBI_23456789";
		account.doActivateAcc(accNo);
		System.out.println("Driver1.main().END");
	}
}

class Account {
	public void doActivateAcc(String accNo) {
		System.out.println("Account. doActivateAcc() START");
		String[] address = {"Raniganj","Asansol"};
		validateAccDetails(accNo,address );
		System.out.println("Account.doActivateAcc() END");
	}

	private boolean validateAccDetails(String accNo, String address[]) {
		System.out.println("Account.validateAccDetails() START");

		System.out.println("Validating account details ... ");
		System.out.println("Checking account status ... ");

		int accountType = 1;
		String bankName = "State Bank of India";
		boolean isActive = true;

		System.out.println("Account Type: " + accountType);
		System.out.println("Bank Name: " + bankName);
		System.out.println("Account Active: " + isActive);
		boolean isValid = true;
		try {
			String homeAddress = address[1];
			System.out.println(homeAddress);
			isValid = accNo.startsWith("SBI"); // NPE if account number is null
			int amount = 100/2;
			int accountNo = Integer.parseInt(accNo);
		} catch (NullPointerException e) {
			System.err.println("Account number cannot be null");
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("You are trying to get value from invalid index");
			e.printStackTrace();
		}catch (ArithmeticException e) {
			System.err.println("Number / zero");
			e.printStackTrace();
		}catch (NumberFormatException e) {
			System.err.println("Number is not in the right format");
			e.getClass();
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Unknown error!!");
			e.printStackTrace();
		}
		
		System.out.println("Account validation completed");
		System.out.println("Account.validateAccDetails() END");

		return isValid;
	}
}