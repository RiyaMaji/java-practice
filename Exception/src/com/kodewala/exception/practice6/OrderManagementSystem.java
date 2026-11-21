package com.kodewala.exception.practice6;

public class OrderManagementSystem {

	public static void main(String[] args) {
		try {
			placeOrder("customer102","Mouse101",-1,"Bangalore",50000,600);
		} catch (OrderException e) {
			System.err.println("Order Failed!!");
			System.out.println(e.getMessage());
			System.out.println("Error Code : " + e.getErrorCode());
		}
	}

	private static void placeOrder(String userId, String productId, int quantity, String city, int balance, int orderAmount) throws OrderException{
		validateUser(userId);
		validateProduct(productId);
		validateQuantity(quantity);
		validateDeliveryArea(city);
		validatePayment(balance,orderAmount);
		System.out.println("Order Placed Successfully!!");
	}

	private static void validatePayment(int balance, int orderAmount) throws InsufficientBalanceException {
		if (orderAmount > balance)
            throw new InsufficientBalanceException(
                "Insufficient payment balance", "AMZ106");
	}

	private static void validateDeliveryArea(String city) throws DeliveryAreaNotInServiceException {
		if (!city.equalsIgnoreCase("Bangalore")) 
            throw new DeliveryAreaNotInServiceException("Delivery not available in this location",
                "AMZ105");
	}

	private static void validateQuantity(int quantity) throws OrderException {
		if(quantity < 1)
			throw new MinQuantityFaultException( "Minimum quantity should be 1", "AMZ103");
		 if (quantity > 5)
			 throw new MaxQuantityFaultException( "Maximum quantity allowed is 5", "AMZ104");
	}

	private static void validateProduct(String productId) throws DuplicateProductException {
		if(productId.equals("Laptop101"))
			throw new DuplicateProductException("Duplicate Product detected", "AMZ102");
	}

	private static void validateUser(String userId) throws UserAlreadyExistsException{
		if(userId.equals("customer101"))
			throw new UserAlreadyExistsException("User Id Already exists", "AMZ100");
	}

}
