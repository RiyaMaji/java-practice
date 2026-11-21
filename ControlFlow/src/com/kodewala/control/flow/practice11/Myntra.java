package com.kodewala.control.flow.practice11;

public class Myntra {

	public void calculateShipping(int shippingType, double orderAmount) {
		switch (shippingType) {
		case 1:if(orderAmount >= 1000) 
			   {
					System.out.println("You are eligible for free shipping!!....");
					System.out.println("Total cart Value : " + orderAmount);
			    }else 
			    {
			    		orderAmount += 50;
			    		System.out.println("Total cart Value : " + orderAmount);
			    }
				break;
		case 2:if(orderAmount >= 2000) 
		   	   {
					orderAmount += 100;
					System.out.println("Total cart Value : " + orderAmount);
		   	   }else 
		   	   {
		   		   orderAmount += 150;
		   		   System.out.println("Total cart Value : " + orderAmount);
		   	   }
			   break;
		case 3:if(orderAmount >= 3000) 
	   	   		{
					orderAmount += 150;
					System.out.println("Total cart Value : " + orderAmount);
	   	   		}else 
	   	   		{
	   	   			orderAmount += 250;
	   	   			System.out.println("Total cart Value : " + orderAmount);
	   	   		}
		   		break;
			
		default:
			System.err.println("Invalid Shipping Type...");
			break;
		}
		
	}

}
