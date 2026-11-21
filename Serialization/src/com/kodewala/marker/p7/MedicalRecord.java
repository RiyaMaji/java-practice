package com.kodewala.marker.p7;

public class MedicalRecord {
	private String diseaseName;
	private String doctorName;
	private double treatmentCost;
	public MedicalRecord(String diseaseName, String doctorName, double treatmentCost) {
		super();
		this.diseaseName = diseaseName;
		this.doctorName = doctorName;
		this.treatmentCost = treatmentCost;
	}
	public String getDiseaseName() {
		return diseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public double getTreatmentCost() {
		return treatmentCost;
	}
	public void setTreatmentCost(double treatmentCost) {
		this.treatmentCost = treatmentCost;
	}

}
