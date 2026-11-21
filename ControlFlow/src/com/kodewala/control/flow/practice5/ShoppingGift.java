package com.kodewala.control.flow.practice5;

public class ShoppingGift {
	public void getGift(double _purchaseAmount) {
		if (_purchaseAmount >= 5000) {
            System.out.println("Gift: Bluetooth Speaker");
        } else if (_purchaseAmount >= 3000) {
            System.out.println("Gift: Power Bank");
        } else if (_purchaseAmount >= 1500) {
            System.out.println("Gift: Shopping Voucher");
        } else {
            System.out.println("No Gift");
        }
	}
}
