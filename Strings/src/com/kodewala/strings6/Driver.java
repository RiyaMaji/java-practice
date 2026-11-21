package com.kodewala.strings6;
class AccountMgmt
{
	int max_value = 100;
	final int UPI_LIMIT = 10000; //constant in java
	public final void doSomething1() //final methods cannot be overridden
	{
		//some func.. android
		max_value = 200; //able to change the values
	}
	public void doSomething2() {
		//some func.. android
		//upi_limit = 20000;
	}
}
class Account extends AccountMgmt{
	//iphone
	@Override
	public void doSomething2(){
		
	}
}
public class Driver {

	public static void main(String[] args) {
		

	}

}
