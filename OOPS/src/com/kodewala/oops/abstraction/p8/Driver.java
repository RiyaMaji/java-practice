package com.kodewala.oops.abstraction.p8;

public class Driver {
	public static void main(String[] args) {
		LibraryService service = new LibraryService();
		service.issueBook(false);
		service.issueBook(true);
		service.issueBook(true);
	}
}
