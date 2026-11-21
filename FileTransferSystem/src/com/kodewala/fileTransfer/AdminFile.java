package com.kodewala.fileTransfer;

import java.io.Serializable;

public class AdminFile implements TransferPermission, Serializable {

	private static final long serialVersionUID = 1L;
	private String fileName;
	public AdminFile(String fileName) {
		super();
		this.fileName = fileName;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
