package com.kodewala.inf4;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Account acc = new Account("Kodewala", "Btm", "46873698217");
		
		Account clonedObjectOfAcc = (Account) acc.clone(); // trying to clone(xerox / copy)
		
		System.out.println(clonedObjectOfAcc.accNo);

		if (acc instanceof Cloneable) {
			System.out.println(" true");
		} else {

			System.out.println("false");
		}
	}

}
