package com.kodewala.oops.abstraction.p8;

public class LibraryService {
	private boolean bookAvailability = true;
	public void issueBook(boolean isMember) {
		if(isMember && checkAvailability()) {
			updateAvailability();
			System.out.println("Book Issued!!!");
		}else
			System.out.println("Book Cannot be issued!!");
	}
	private boolean checkAvailability() {
		return bookAvailability;
	}
	private void updateAvailability() {
		bookAvailability = false ;
	}

}
