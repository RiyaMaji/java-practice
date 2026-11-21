package com.kodewala.constructors2;
class Invoice extends Object{
	static int gst =18;
	int amount;
	String itemName;
	String billingAddress;
	String customerID;
	String customerName;
	
	Invoice(int _amount, String _itemName,String _billingAddress,String _customerID,String _customerName){
		this.amount=_amount;
		this.itemName=_itemName;
		this.billingAddress=_billingAddress;
		this.customerID=_customerID;
		this.customerName=_customerName;
	}
}
public class Driver {

	public static void main(String[] args) {
		
		//Invoice.gst = 28; //Changing it
		Invoice inv = new Invoice(180000, "iPhone18","Kodewala BTM 2nd","Bangalore","C4321");
		Invoice inv1 = new Invoice(160000, "iPhone17","Kodewala BTM 1st","Bangalore","C5321");
		
		System.out.println(inv.amount + " " + inv.gst);
		System.out.println(inv1.amount + " " + inv1.gst);
	}

}
