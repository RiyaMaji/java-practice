package com.kodewala.marker.p5;

public class PublicDocument implements Transferable {
	private String documentName;

	public PublicDocument(String documentName) {
		super();
		this.documentName = documentName;
	}

	public String getDocumentName() {
		return documentName;
	}
}
