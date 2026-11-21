package com.kodewala.inf.p12;

public interface IVoiceAssistant {
	public default void start() {
		System.out.println("VoiceAssistant.start()");
	}
}
