package com.kodewala.fileTransfer;

import java.io.Serializable;

public class PrivateFile implements Serializable {

	private static final long serialVersionUID = 1L;
	private String fileName;
	private transient String confidentialData;
	public PrivateFile(String fileName, String confidentialData) {
		super();
		this.fileName = fileName;
		this.confidentialData = confidentialData;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getConfidentialData() {
		return confidentialData;
	}
	public void setConfidentialData(String confidentialData) {
		this.confidentialData = confidentialData;
	}
	
}
