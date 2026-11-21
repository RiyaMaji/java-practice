package com.kodewala.inf.p12;

public class SmartHomeDevice implements ISecuritySystem, IVoiceAssistant {
	//Explicitly call both interface implementations using InterfaceName.super
	@Override
	public void start() {
		ISecuritySystem.super.start();
		IVoiceAssistant.super.start();
		System.out.println("SmartHomeDevice.start()");
	}
}
