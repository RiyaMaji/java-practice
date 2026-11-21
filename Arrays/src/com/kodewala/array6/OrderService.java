package com.kodewala.array6;

public class OrderService {
	public void calculateDeliveryCharge(FoodOrder foodOrder) 
	{
		if(foodOrder.getDeliveryDistance()>=0 && foodOrder.getDeliveryDistance() < 12) 
		{
			double deliveryCharge = 0;
			if(foodOrder.getOrderAmount() >= 500) 
			{
				System.out.println("Free delivery!!");
				System.out.println("Order Total : " + (foodOrder.getOrderAmount()+deliveryCharge));
			}else {
			if(foodOrder.getDeliveryDistance() > 7 && foodOrder.getDeliveryDistance() <= 12) {
					deliveryCharge = 70;
					System.out.println("Order Total : " + (foodOrder.getOrderAmount()+deliveryCharge));
			}else if(foodOrder.getDeliveryDistance() > 3 && foodOrder.getDeliveryDistance() <= 7) {
					deliveryCharge = 40;
					System.out.println("Order Total : " + (foodOrder.getOrderAmount()+deliveryCharge));
			}else if(foodOrder.getDeliveryDistance() > 0 && foodOrder.getDeliveryDistance() <= 3) {
					deliveryCharge = 20;
					System.out.println("Order Total : " + (foodOrder.getOrderAmount()+deliveryCharge));
			}else
				System.out.println("Order Total : " + (foodOrder.getOrderAmount()+deliveryCharge));
			}
		}else
			System.out.println("Not deliverable!!");
	}
}