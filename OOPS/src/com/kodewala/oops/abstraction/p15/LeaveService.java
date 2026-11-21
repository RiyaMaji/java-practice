package com.kodewala.oops.abstraction.p15;

public class LeaveService {
	private int leaveBalance = 12;
	public void applyLeave(int days) {
		if(validateEmployee() && checkLeaveAvailability(days)) {
			deductLeave(days);
			System.out.println("Leave Approved..");
		}else
			System.out.println("Leave reuest rejected!");
	}
	private void deductLeave(int days) {
		leaveBalance -= days;
	}
	private boolean validateEmployee() {
		return true;
	}
	private boolean checkLeaveAvailability(int days) {
		return days > 0 && leaveBalance >= days;
	}
	
	public void displayLeaveBalance() {
		System.out.println("Leave Balance : "+ leaveBalance);
	}
}
