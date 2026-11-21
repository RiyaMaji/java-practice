package com.kodewala.array9;

public class Astrologer {
	private String astrologerName;
	private int experienceYears;
	private int consultationMinutes;
	public Astrologer(String astrologerName, int experienceYears, int consultationMinutes) {
		super();
		this.astrologerName = astrologerName;
		this.experienceYears = experienceYears;
		this.consultationMinutes = consultationMinutes;
	}
	public String getAstrologerName() {
		return astrologerName;
	}
	public int getExperienceYears() {
		return experienceYears;
	}
	public int getConsultationMinutes() {
		return consultationMinutes;
	}
	
}
