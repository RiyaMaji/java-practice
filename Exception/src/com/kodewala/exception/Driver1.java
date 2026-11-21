package com.kodewala.exception;

public class Driver1 {
	public static void main(String[] args) {
		System.out.println("Driver1.main() START");
		Driver1 driver1 = new Driver1();
		driver1.doSomething();
		System.out.println("Driver1.main() END");
	}

	public void doSomething() {
		System.out.println("Driver1.doSomething() START");
		String name = null;
		int amount = 0 ;
		try {
			//risky code --> code which may throw exception
			amount = amount / 0 ; //AE
			System.out.println(name.length()); // NPE -> not handled
			System.out.println("After length()"); //ignored
		}catch(NullPointerException e) // This can catch Exception's object and its child objects
		{
			System.err.println("Name is null..");
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			System.err.println("Amount cannot be divided by zero..");
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Driver1.doSomething() END");

	}

}
