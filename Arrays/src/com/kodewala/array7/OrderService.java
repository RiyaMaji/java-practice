package com.kodewala.array7;

public class OrderService {
	public String orderStatus(Order order) {
		String status = "Order Invalid!!!!";
		if(order.getOrderStatus().equalsIgnoreCase("CANCELLED"))
				status = "Order Cancelled!!";
			else
			{
				if(order.getOrderAmount() > 0 && order.getOrderAmount() < 500)
					status = "Small Order!!!";
				else if(order.getOrderAmount() >= 500 && order.getOrderAmount() <= 2000)
					status = "Medium Order!!!";
				else if(order.getOrderAmount() > 2000)
					status ="Large Order";
				else 
					status = "Order Invalid!!!!" ;
			}
		return status;
	}
}
