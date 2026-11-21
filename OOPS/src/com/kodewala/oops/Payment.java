package com.kodewala.oops;
//Earlier this class was not well encapsulated
//change the variable access modifier to private 
//and add getter setter for any modification
public class Payment {
	private int balance;    //data or variable -> if public other classes can change this variable w/o your(Payment) class permission

	public Payment(int balance) {
		super();
		this.balance = balance;
	}
	//setter
	public void doCredit(int _amount) // allow to change the data with controlled access.
	{ //Modifying the data
		if(_amount>0)
		balance+=_amount;   
	}
	//setter
	public void doDedit(int _amount) { //Modifying the data
		if(balance>_amount)
		balance-=_amount;
	}
	public int getBalance() {
		return balance;
	}

}
