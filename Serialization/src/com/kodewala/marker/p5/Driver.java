package com.kodewala.marker.p5;

public class Driver {
	
	public static void transferDocument(Object obj) {
		if(obj instanceof Transferable)
			System.out.println("Document is allowed to transfer!!");
		else
			System.err.println("Opps!!Document is not allowed to transfer..");
	}
	public static void main(String[] args) {
		PublicDocument publicDocument = new PublicDocument("Student Details..");
		ConfidentialDocument confidentialDocument = new ConfidentialDocument("Student Marks..");
		
		transferDocument(publicDocument);
		transferDocument(confidentialDocument);

	}

}
