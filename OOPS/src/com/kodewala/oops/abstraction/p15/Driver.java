package com.kodewala.oops.abstraction.p15;

public class Driver {
	public static void main(String[] args) {
		LeaveService service = new LeaveService();
		
		service.applyLeave(3);
		service.displayLeaveBalance();
		
		
		service.applyLeave(7);
		service.displayLeaveBalance();
		
		service.applyLeave(3);
		service.displayLeaveBalance();
	}
}
