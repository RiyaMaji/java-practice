package com.kodewala.control.flow.practice14;

public class MobileRecharge {

	public void recharge(int plan, double walletBalance) {
		double price = 0.0f;
		switch (plan) {
		case 1:{
				price = 199;
				rechargeStatus(price, walletBalance);
			}
			break;
		case 2 :{
				price = 299 ;
				rechargeStatus(price, walletBalance);
			}
			break;
		case 3 :{
				price = 499;
				rechargeStatus(price, walletBalance);
			}
			break;
		case 4:{
				price =799;
				rechargeStatus(price, walletBalance);
			}
			break;
		default:
			System.out.println("Please choose a valid plan !!!");
			break;
		}
	}
	void rechargeStatus(double price,double walletBalance) {
		if(walletBalance >= price) {
			walletBalance -= price;

            System.out.println("Recharge Successful!!!");
            System.out.println("Plan Price: Rs." + price);
            System.out.println("Remaining Wallet Balance: Rs." + walletBalance);
			
		}else
			System.out.println("Insufficient Wallet Balance!!!");
		
	}

}
