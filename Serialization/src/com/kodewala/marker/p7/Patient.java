package com.kodewala.marker.p7;

public class Patient {
	private int patientId;
	private String patientName;
	Address address;
	MedicalRecord mR;
	public Patient(int patientId, String patientName, Address address, MedicalRecord mR) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.address = address;
		this.mR = mR;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public MedicalRecord getmR() {
		return mR;
	}
	public void setmR(MedicalRecord mR) {
		this.mR = mR;
	}

}
