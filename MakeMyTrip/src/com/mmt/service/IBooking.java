package com.mmt.service;

import com.mmt.model.Booking;
import com.mmt.model.SearchResult;

public interface IBooking {
	
	Booking book(String name, String source,String destination) throws Exception;
	Booking checkStatus(Booking booking) throws Exception;
	SearchResult search();
	void cancelBooking();
	
	default void autoUpgrade() {
		System.out.println("Auto-Upgraded!!");		
	}
	
	static void print() {
		System.out.println("IBooking.print()");
	}

}
